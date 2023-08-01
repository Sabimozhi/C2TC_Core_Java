package com.cg.day2;

import java.util.Scanner;

public class IfelseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100) {
			System.out.println("Century +");
		}
		else if(score<100 && score>50) {
			System.out.println("Fifty =");
		}
		else {
			System.out.println("no century");
		}
		sc.close();
	}
}
