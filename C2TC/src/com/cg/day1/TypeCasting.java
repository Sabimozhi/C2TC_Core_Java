package com.cg.day1;

public class TypeCasting {

	public static void main(String[] args) {
		System.out.println("In java, two types of casting\ntype 1: Widening - converting smaller type to a lager type size");
		byte myByte=123;
		System.out.println(myByte);
		short myShort= myByte;
		System.out.println(myShort);
		int myInt=myByte;
		System.out.println(myByte);
		long myLong=myInt;
		System.out.println(myLong);
		float myFloat=myLong;
		System.out.println(myFloat);
		double myDouble=myFloat;
		System.out.println(myDouble);
		System.out.println("2: Narrowing - converting larger data type to a smaller type size");
		double my_Double=103.54d;
		System.out.println(myDouble);
		float my_Float=(float)my_Double;
		System.out.println(my_Float);
		long my_Long=(long)my_Double;
		System.out.println(my_Long);
		int my_Int=(int)my_Long;
		System.out.println(my_Int);
		short my_Short= (short)my_Int;
		System.out.println(my_Short);
		byte my_Byte=(byte)my_Short;
		System.out.println(my_Byte);
	}

}
