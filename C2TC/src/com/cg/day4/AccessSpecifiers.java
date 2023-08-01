package com.cg.day4;

class Publicclass{  
	public int data1=40;  
	public void display1(){
		System.out.println("Hello java");
		}  
	}  
	//DEFAULT CLASS
class Defaultclass{  
	 int data2=40;  
	 void display2(){
		System.out.println("Hello javascript");
		}  
	} 
	/*PROTECTED CLASS
	protected class Proclass{  
		 protected int data3=40;  
		 void display3(){
			System.out.println("Hello hi");
			}  
		}*/  

public class AccessSpecifiers {

	public static void main(String[] args) {
		Publicclass p1=new Publicclass();
		Defaultclass d=new Defaultclass();
//		Proclass pro=new Proclass();
		d.display2();
//	    p.display();//Compile Time Error 
   	    p1.display1();
	    //pro.display3();//compile time error

	}

}
