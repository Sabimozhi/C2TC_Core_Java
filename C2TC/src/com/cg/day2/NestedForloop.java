package com.cg.day2;

import java.util.Scanner;

public class NestedForloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
        for(int i=1;i<=score;i++) {
        	for(int j=1;j<=i;j++)
        		System.out.print(j);
        	System.out.println("\n");
        }
		sc.close();
	}
}
