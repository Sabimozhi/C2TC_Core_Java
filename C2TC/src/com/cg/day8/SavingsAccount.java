package com.cg.day8;

public class SavingsAccount extends Person implements Bank{

	private int acc_no;
	private float balance;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int acc_no, float balance) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}


	public void deposit(float amount) {
		if(amount >30000) {
			System.out.println("exceeds daily limit rs.30000");
		}
		else {
			balance+=amount;
			System.out.println("the total balance is "+balance);
		}
	}


	public void withdraw(float amount) {
		if(amount>balance) {
			System.out.println("Insufficient amount");
		}
		else {
			balance-=amount;
			System.out.println("amount withdrawn "+amount);
			System.out.println("Your account balance "+balance);
		}
	}


	public String toString() {
		return "SavingsAccount [acc_no=" + acc_no + ", balance=" + balance + ", getAcc_no()=" + getAcc_no()
				+ ", getBalance()=" + getBalance() + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}}
