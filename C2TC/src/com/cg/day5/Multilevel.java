package com.cg.day5;

public class Multilevel {
	void layer1() {
		System.out.println("class1 is inherited by class2");
	}
}
class Multilevel_1 extends Multilevel{
	void layer2() {
		System.out.println("class2 is inherited by class3");
	}
}
class Multilevel_2 extends Multilevel_1{
	void layer3() {
		System.out.println("class2 is inherited");
	}
}
