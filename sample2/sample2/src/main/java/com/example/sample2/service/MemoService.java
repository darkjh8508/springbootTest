package com.example.sample2.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import com.example.sample2.common.ModelMapperUtils;
import com.example.sample2.domain.entity.Memo;
import com.example.sample2.domain.repository.MemoRepository;
import com.example.sample2.dto.MemoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoService {
    @Autowired
    MemoRepository memoRepository;

    /**
     * 메모 가져오기
     * @return
     */
    public List<MemoDto> memoList() {
        List<Memo> memoList = memoRepository.findAll();

        return memoList.stream().map(memo -> ModelMapperUtils.getModelMapper().map(memo, MemoDto.class)).collect(Collectors.toList());
    }

    /**
     * 메모 저장
     * @param memoText
     */
    @Transactional
    public void saveMemo(String memoText) {
        Memo memo = new Memo();
        memo.setMemoText(memoText);

        memoRepository.save(memo);
    }

    /**
     * 메모 수정
     * @param id
     * @param memoText
     */
    @Transactional
    public void updateMemo(Long id, String memoText) {
        Memo memo = new Memo();

        memo.setId(id);
        memo.setMemoText(memoText);

        memoRepository.save(memo);
    }

    /**
     * 메모 삭제
     * @param id
     */
    @Transactional
    public void deleteMemo(Long id) {
        Memo memo = new Memo();
        
        memo.setId(id);

        memoRepository.delete(memo);
    }
}
