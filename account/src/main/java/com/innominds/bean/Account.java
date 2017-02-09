package com.innominds.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountNumber;

	private String name;

	private double balance;
	
	@Embedded
	private Address address;

	protected Account() {

	}

	public Account(String name, double balance,Address address) {

		this.name = name;
		this.balance = balance;
		this.address=address;
	}
//
//	@Override
//	public String toString() {
//		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
//	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", city="
				+ address.getCity() + ",state="+address.getState()+",country="+address.getCountry()+"]";
	}

	

}
