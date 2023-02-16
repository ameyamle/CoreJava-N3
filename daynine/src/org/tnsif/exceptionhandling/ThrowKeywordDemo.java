package org.tnsif.exceptionhandling;

import java.util.Scanner;

public class ThrowKeywordDemo {
	
	public static void donate(int age, int weight) throws Exception {
		
		if(age > 18 && weight > 50) {
			System.out.println("You can donate the blood...");
		}
		else {
			throw new Exception("Not eligible");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age and weight:");
		int x = s.nextInt();
		int y = s.nextInt();
		try {
			donate(x, y);
			}
		
			catch(Exception e)
			{
				System.out.println(e);
			}
		s.close();
		}

	}