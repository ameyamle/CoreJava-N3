package org.tnsif.operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int x = s.nextInt();
		int y = s.nextInt();
		s.close();
		
		// Arithmatic 
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//Assignment
		System.out.println(x+=y);
		System.out.println(x-=y);
		System.out.println(x*=y);
		System.out.println(x/=y);
		System.out.println(x%=y);
		
		//Relational/ Comparison
		// create variables
		int a1 = 7, b1 = 11;
		// value of a and b
		System.out.println("a is " + a1 + " and b is " + b1);
		// == operator
		System.out.println(a1 == b1);  // false
		// != operator
		System.out.println(a1 != b1);  // true
		// > operator
		System.out.println(a1 > b1);  // false
		// < operator
		System.out.println(a1 < b1);  // true
		// >= operator
		System.out.println(a1 >= b1);  // false
		// <= operator
		System.out.println(a1 <= b1);  // true
		
		//Logical
		System.out.println(true && true);
		System.out.println(true || false);
		System.out.println(!true);
		
		//Boolean
		boolean bool = true;
		System.out.println(bool);
		
		//Bitwise
		int a = x;
		int b = y;
		System.out.println("a&b = " + (a & b));
		
		System.out.println("a|b = " + (a | b));
		
		System.out.println("a^b = " + (a ^ b));
		
		System.out.println("~a = " + ~a);
		
		a &= b;
		System.out.println("a= " + a);
		
		//Ternary
		int num = 100;
		String res = (5 == num)?"Equal":"Unequal";
		System.out.println(res);
		
		//Unary
		int n = 50;
		System.out.println(n++);
		System.out.println(n--);
		System.out.println(++n);
		System.out.println(--n);
		System.out.println(!true);
		
	}

}
