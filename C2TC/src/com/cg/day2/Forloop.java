package com.cg.day2;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		//for loop
        for(int i=1;i<score;i++) {
        	System.out.println(i);
        }
		sc.close();
	}
}
