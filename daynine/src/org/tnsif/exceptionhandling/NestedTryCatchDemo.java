package org.tnsif.exceptionhandling;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int[] arr = new int[]{1, 2, 3};
		try {
			try {
				System.out.println(x/y);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
