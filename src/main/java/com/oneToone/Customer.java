package com.oneToone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cust_table")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cust_id")
	private int id;

	private String name;

	private String mobileNo;

	@OneToOne(targetEntity = Transaction1.class, cascade = CascadeType.ALL)
	private Transaction1 transaction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Transaction1 getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction1 transaction) {
		this.transaction = transaction;
	}
}
