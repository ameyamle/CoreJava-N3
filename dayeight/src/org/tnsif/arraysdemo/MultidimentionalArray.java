package org.tnsif.arraysdemo;

import java.util.Scanner;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array dimention:");
		int n = s.nextInt();
		int m = s.nextInt();
		
		int arr[][] = new int[n][m];
		
		System.out.println("Enter array elements:");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				arr[i][j] = s.nextInt();				
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr[i][j] + " ");				
			}
		}
		
		s.close();
	}

}
