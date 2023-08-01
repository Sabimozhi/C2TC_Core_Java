package com.cg.day2;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// to get input from user
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		//operators
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println(num1*num2);
		System.out.println(num1++);
		System.out.println(--num2);
		sc.close();
	}
}
