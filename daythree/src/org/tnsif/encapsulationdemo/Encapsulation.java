package org.tnsif.encapsulationdemo;

public class Encapsulation {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setPin(9876);
		System.out.println(h.getPin());
		h.accept();
	}

}
