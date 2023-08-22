package com.example.demo;

public class RejectLoanException extends RuntimeException {

	private static final long serialVersionUID = -5783548812205635040L;

	public RejectLoanException(String message) {
		super(message);
	}
}
