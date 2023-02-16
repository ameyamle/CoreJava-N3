package org.tnsif.arraysdemo;

import java.util.Scanner;

public class JaggedArray {
//jagged array - array inside array with different array size
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//main array
		int arr[][] = new int [2][];
		//first array has 3 columns - inside array
		arr[0] = new int[3];
		//second array has 2 columns
		arr[1] = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();				
			}
		}
		//
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
