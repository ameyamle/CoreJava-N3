package org.tnsif.arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array:");
		
		int n = s.nextInt();
		int arr1[] = new int[n];
		
		System.out.println("Enter elements:");
		
		for(int i = 0; i < n; i++) {
			arr1[i] = s.nextInt();
		}
		
		System.out.println("Elements of array are:");
		
		for(int j = 0; j < n; j++) {
			System.out.println(arr1[j] + " ");
			
		}
		
		Arrays.sort(arr1);
		System.out.println("Sorted array:");
		for (int i = 0; i < n; i++) {
			System.out.println(arr1[i]);
		}
		
/*		for(int i:arr1) {
			System.out.println(arr1[i]);
		}
*/
		s.close();
	}

}
