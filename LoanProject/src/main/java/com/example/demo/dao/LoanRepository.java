package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoanEntity;

public interface LoanRepository extends JpaRepository<LoanEntity, Long> {

}
