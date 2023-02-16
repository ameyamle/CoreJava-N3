package org.tnsif.exceptionhandling;

import java.util.Scanner;
//1111111111111111111111111111111111111111111111
public class PipeCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {11, 22, 33};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of x and y:");
		int x = s.nextInt();
		int y = s.nextInt();
		
		try {
			int res = x/y;
			System.out.println(res);
			}
		catch(Exception e) {
			System.out.println("Exception handled " + e);
		}
		
		s.close();
	}

}
