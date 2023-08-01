package com.cg.day6;

public class StaticBlock {
	static{
		System.out.println("Static block is executed before the main function");
	}
	public static void main(String[] args) {
		System.out.println("main function");
	}
}
