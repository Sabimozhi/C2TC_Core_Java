package com.cg.day3;

public class MainClass {

	public static void main(String[] args) {
		//Constructor c=new Constructor();
        Details d1;
        d1=new Details("abi",18,2098);
        d1.display();
        d1=new Details("anu",18,2099);
        d1.display();
        Encapsulation e=new Encapsulation();
        e.setName("Sabi");
        e.setAge(21);
        e.setId(201021098);
        System.out.println(e.toString());

	}

}
