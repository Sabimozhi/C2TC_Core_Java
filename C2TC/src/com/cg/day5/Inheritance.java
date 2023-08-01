package com.cg.day5;

public class Inheritance {

	public static void main(String[] args) {
		//Single inheritance
		SingleOne s=new SingleOne();
		s.two();
		s.one();
		//Multilevel inheritance
		Multilevel_2 m=new Multilevel_2();
		m.layer3();
		m.layer2();
		m.layer1();
		//Hierarchy inheritance
		Hierarchy_1 h1=new Hierarchy_1();
		h1.loin();
		Hierarchy_2 h2=new Hierarchy_2();
		h2.tiger();
		h2.animal()	;
	}
}
