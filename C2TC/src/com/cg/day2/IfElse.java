package com.cg.day2;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		//ifelse
		if(score>100) {
			System.out.println("Century +");
		}
		else {
			System.out.println("no century");
		}
		sc.close();
	}
}
