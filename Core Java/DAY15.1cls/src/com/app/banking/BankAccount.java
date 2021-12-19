package com.app.banking;

import java.time.LocalDate;

import custom_exception.BankingException;

import static utils.ValidationRule.validateBalance;

public class BankAccount {
	private int accNo;
	private AccountType acType;
	private double balance;
	private LocalDate creationDate;
	private String customerName;
	public double getBalance() {
		return balance;
	}
	public BankAccount(int accNo, AccountType acType, double balance, LocalDate creationDate, String customerName) {
		super();
		this.accNo = accNo;
		this.acType = acType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", acType=" + acType + ", balance=" + balance + ", creationDate="
				+ creationDate + ", customerName=" + customerName + "]";
	}
	
	public AccountType getAcType() {
		return acType;
	}
	public void deposit(double amt) {
		balance+=amt;
	}
	
	public void withdraw(double amt) throws BankingException {
		validateBalance(this.balance-amt);
		balance -=amt;
	}
	
	//transfer fund method
	public void transferFunds(BankAccount dest,double amt) throws BankingException {
		this.withdraw(amt);
		dest.deposit(amt);
	}
	 
}
