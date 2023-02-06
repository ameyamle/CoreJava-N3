package org.tnsif.classandobject;

import java.util.Scanner;

//driver class
public class CustomerDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Customer Id, Name, City: ");
		int id = sc.nextInt();
		String name = sc.next();
		String city = sc.nextLine();
		
		Customer c = new Customer(id, name, city);
		c.display();
		sc.close();		
	}

}
