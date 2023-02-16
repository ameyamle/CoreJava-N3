package org.tnsif.exceptionhandling;

public class ArrayOutofBoundDemo {

	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("Second line");
		
		int[] myIntArr = new int[]{1, 2, 3};
		
		//System.out.println(myIntArray);
		try {
			System.out.println(myIntArr[3]);
			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error handled and it is " + e);
		}
		//finally block is always executed instead of error occured or not
		finally {
			System.out.println("Finally block");
		}

	}
}
