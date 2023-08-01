package com.cg.day4;

public class Private {

		private void specifier() {
			System.out.println("Private access specifier can be accessed only within the same class");
		}
		public static void main(String args[]) {
			Private p=new Private();
			p.specifier();

	}
}
/*
class Main{
public static void main(String args[]) {
	Private p=new Private();
	p.specifier();
	}
}
*/