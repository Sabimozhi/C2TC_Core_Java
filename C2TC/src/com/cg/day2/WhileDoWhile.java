package com.cg.day2;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// to get input from user
		int num1=sc.nextInt();
		int i=1;
		int sum=0;
		//while loop
		while(i<num1) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		//do-while
		do {
			System.out.println("Do-while loop");
			System.out.println(i);//value of i=10
			i++;//i=11
		}while(i<5);//11<5
		sc.close();
	}
}
