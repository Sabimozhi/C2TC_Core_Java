package com.cg.day7;

public class Polymorphism {

	public static void main(String[] args) {
		Overloading load=new Overloading();
		System.out.println(load.Overloading(10.5, 28.9));
		System.out.println(load.Overloading(10, 34));
		Overriding ride;
		ride=new SBI();
		System.out.println(ride.getRateOfInterest());
		ride=new HDFC();
		System.out.println(ride.getRateOfInterest());
		ride=new ILFC();
		System.out.println(ride.getRateOfInterest());
		ride=new Overriding();
		System.out.println(ride.getRateOfInterest());
		Color obj;
		obj=new Green();
		System.out.println(obj.getColor());
		obj=new Color();
		System.out.println(obj.getColor());
	}

}
