package com.cg.day2;

import java.util.Scanner;

public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		//nested ifelse
		if(score<100) {
				if(score>50) {
					System.out.println("Fifty +");
				}
		}
		else {
			System.out.println("century +");
		}
		sc.close();
	}
}
