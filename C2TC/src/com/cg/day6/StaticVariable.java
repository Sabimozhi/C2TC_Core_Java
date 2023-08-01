package com.cg.day6;

public class StaticVariable {
	String name;
	int id;
	static String college = "IFET";
	
	public StaticVariable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaticVariable(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	static void methodStatic() {
		college =" IFET College Of Engineering";
	}
	public void display(String name, int id) {
		System.out.println(name +" "+id +" "+college);	
	}
}
