package org.tnsif.exceptionhandling;

import java.util.Scanner;

public class MultipleCatchBlockDemo {

	public static void main(String[] args) {
		String[] s = {"abc", "123", null, "xyz"};
		for(int i = 0; i < 5; i++) {
			try {
				int a = s[i].length() + Integer.parseInt(s[i]);
			}
			catch(NumberFormatException e) {
				System.out.println("Number Format Exception error handled -> " + e);
			}
			catch(NullPointerException e) {
				System.out.println("Null Pointer Exception error handled -> " + e);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index Out Of Bounds Exception error handled -> " + e);
			}
/*			//method 2
			catch(Exception e) {
			System.out.println("Exception handled " + e);
			}*/
/*			//method 3
			catch(NullPointerException |ArrayIndexOutOfBoundsException e) {
				System.out.println("Exception handled " + e);
			}*/
		}

	}
		
/*		int arr[] = new int[] {11, 22, 33};
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
	}
		*/
}
