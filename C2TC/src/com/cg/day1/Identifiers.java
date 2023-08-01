package com.cg.day1;

public class Identifiers {

	public static void main(String[] args) {
		/*identifiers can start with
		 * (A-Z)
		 * (a-z)
		 * ($ and _)
		 */
		int a=10;
		int A1=0;
		String one="ten";
		int _number=20;
		int $two=30;
		int sum=_number+$two;
		/*identifiers won't start with digits(0-9)
		 * int 9start;
		 * identifiers must not contain operators
		 * int one*two=20;
		 * identifiers should not contain space
		 * int one two;
		 * reserved words can't be used as identifiers
		 * String while="100";
		 */
		 System.out.println("a = "+a);
		 System.out.println("A1 = "+A1);
		 System.out.println("value of string one is "+one);
		 System.out.println("sum of _number and $two is "+sum);

	}

}
