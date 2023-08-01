package com.cg.day2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("grade should be less than 6");
		int grade=sc.nextInt();
		switch (grade){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default:
			System.out.println("enter proper input");
			break;
		}
		sc.close();
	}
}
