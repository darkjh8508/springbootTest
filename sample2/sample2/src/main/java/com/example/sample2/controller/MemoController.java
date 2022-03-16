package com.example.sample2.controller;

import java.util.List;

import com.example.sample2.dto.MemoDto;
import com.example.sample2.service.MemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoController {

    @Autowired
    MemoService memoService;

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }

    /**
     * 메모 리스트 가져오기
     * @return
     */
    @GetMapping(value = "/getMemo")
    public ResponseEntity<List<MemoDto>> memoList() {
        return ResponseEntity.ok(memoService.memoList());
    }

    /**
     * 메모 저장
     * @param memoText
     */
    @PostMapping(value = "/saveMemo")
    public void saveMemo(@RequestParam(value = "memoText") String memoText) {
        memoService.saveMemo(memoText);
    }

    /**
     * 메모 수정
     * @param id
     * @param memoText
     */
    @PutMapping(value = "/updateMemo/{id}")
    public void updateMemo(@PathVariable(value = "id") Long id, @RequestParam(value = "memoText") String memoText) {
        memoService.updateMemo(id, memoText);
    }

    /**
     * 메모 삭제
     * @param id
     */
    @DeleteMapping(value = "/deleteMemo/{id}")
    public void deleteMemo(@PathVariable(value = "id") Long id) {
        memoService.deleteMemo(id);
    }

    /**
     * 테스트 확인
     */
}
