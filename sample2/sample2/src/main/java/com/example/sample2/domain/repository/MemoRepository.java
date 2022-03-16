package com.example.sample2.domain.repository;

import com.example.sample2.domain.entity.Memo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    
}
