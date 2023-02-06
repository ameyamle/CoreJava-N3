package org.tnsif.classandobject;

public class Customer {
	private int id;
	private String custname;
	private String city;
	
	//default constructor
	
	public Customer() {}
	
	public Customer(int id, String custname, String city) {
		this.id = id;
		this.custname = custname;
		this.city = city;
	}
	
	void display() {
		System.out.print(id+" "+custname+" "+city);
	}
	public int getId() {
		return id;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
