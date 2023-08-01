package com.cg.day8;

public interface Bank {
	static final float min_balance=5000; 
	static final float deposit_limit=30000;
	public void deposit(float amount);
	public void withdraw(float amount);
}
