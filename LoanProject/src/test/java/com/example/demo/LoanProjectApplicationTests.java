package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.LenderRepository;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.entity.LenderEntity;
import com.example.demo.entity.LoanEntity;
import com.example.demo.service.LoanService;

@SpringBootTest
class LoanProjectApplicationTests {

	@Autowired
	private LoanService loanService;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	LenderRepository lenderRepository;

	@Test
	void contextLoads() throws ParseException {
		CustomerEntity customer = new CustomerEntity();
		customer.setId(1l);
		customerRepository.save(customer);
		LenderEntity lenderEntity = new LenderEntity();
		lenderEntity.setId(1l);
		lenderRepository.save(lenderEntity);
		LoanEntity loanEntity = new LoanEntity();
		loanEntity.setAmount(10000);
		loanEntity.setCustomerEntity(customer);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = simpleDateFormat.parse("06/12/2022");
		Date date2 = simpleDateFormat.parse("10/01/2021");
		loanEntity.setDueDate(date1);
		loanEntity.setPaymentDate(date2);
		loanEntity.setInterset(1.0);
		loanEntity.setLenderEntity(lenderEntity);
		loanEntity.setPenality(0.01);
		loanEntity.setRemainAmount(5000);

		assertEquals(loanService.createLoan(loanEntity), "Success");

	}

}
