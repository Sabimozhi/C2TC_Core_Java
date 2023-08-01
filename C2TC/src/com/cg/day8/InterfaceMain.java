package com.cg.day8;

public class InterfaceMain {

	public static void main(String[] args) {
		SavingsAccount savings=new SavingsAccount();
		savings.setAcc_no(201021098);
		savings.setBalance(20000);
		savings.setCity("Banglore");
		savings.setName("kapoor");
		savings.deposit(25000);
		savings.withdraw(10000);
		System.out.println(savings.toString());
	}
}
