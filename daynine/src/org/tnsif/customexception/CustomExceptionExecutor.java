package org.tnsif.customexception;

import java.util.Scanner;


//program to demonstrate the custom exception
public class CustomExceptionExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id and passowrd: ");
		String id = s.nextLine();
		String password = s.nextLine();
		
		try {
			
			//use equals instead of comparison operator
			if(id.equals("abc@gmail.com") && password.equals("abc@123")) {
				System.out.println("Credential matched");
			}
			else {
				throw new LoginCredential("Invalid credential");
			}
		}
		catch(LoginCredential e){
			System.out.println("Exception handled ->" + e);
		}
		
		s.close();
	}

}
