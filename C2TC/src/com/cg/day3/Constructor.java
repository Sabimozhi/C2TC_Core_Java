package com.cg.day3;

public class Constructor {
	public Constructor() {
		super();
	}
}

class Details{
	String name;
	int age;
	int id;
	// parameterized constructor
	public Details(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	void display() {
		System.out.println(name+" "+age+" "+id);
	}
}
