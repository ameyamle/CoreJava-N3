package org.tnsif.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x = s.nextInt();
		int y = s.nextInt();
		try {
			int z = x/y;
			System.out.println(z);
		}
		//catch block will handle exception
		catch(Exception e) {
			System.out.println("Exeption handling using catch " + e);
			}
		finally {
			System.out.println("Finally block");
		}
		s.close();
		}
	}