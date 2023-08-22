package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustomerEntity;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>{

}
