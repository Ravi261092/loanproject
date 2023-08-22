package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LoanEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private CustomerEntity customerEntity;

	@OneToOne
	private LenderEntity lenderEntity;

	@Column
	private Integer amount;

	@Column
	private Integer remainAmount;
	@Column
	private Date paymentDate;
	@Column
	private Date dueDate;
	@Column
	private Double penality;
	@Column
	private Double interset;
	@Column
	private boolean cancel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public LenderEntity getLenderEntity() {
		return lenderEntity;
	}

	public void setLenderEntity(LenderEntity lenderEntity) {
		this.lenderEntity = lenderEntity;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getRemainAmount() {
		return remainAmount;
	}

	public void setRemainAmount(Integer remainAmount) {
		this.remainAmount = remainAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getPenality() {
		return penality;
	}

	public void setPenality(Double d) {
		this.penality = d;
	}

	public Double getInterset() {
		return interset;
	}

	public void setInterset(Double interset) {
		this.interset = interset;
	}

	public boolean isCancel() {
		return cancel;
	}

	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}

}
