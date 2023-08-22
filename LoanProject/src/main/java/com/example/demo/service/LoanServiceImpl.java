package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.RejectLoanException;
import com.example.demo.dao.LoanRepository;
import com.example.demo.entity.LoanEntity;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepository;

	@Override
	public String createLoan(LoanEntity loanEntity) {
		if (loanEntity.getPaymentDate().after(loanEntity.getDueDate())) {
			throw new RejectLoanException("payment date can’t be greater than the Due Date.");
		}
		LoanEntity l = loanRepository.save(loanEntity);
		return l.getId() != null ? "Success" : "Failed";

	}

}
