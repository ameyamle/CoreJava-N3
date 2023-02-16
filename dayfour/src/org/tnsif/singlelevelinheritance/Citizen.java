package org.tnsif.singlelevelinheritance;

//Demonstrate single level inheritance
//parent class
public class Citizen {
	//private data member
	private String name;
	private String adharno;
	private String city;
	private long mno;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getmno() {
		return mno;
	}
	public void setmno(long mno) {
		this.mno = mno;
	}
	
	//Default constructor
	public Citizen() {
		super();
		System.out.println("Parent class");
	}
	
	//Parameterized constructor
	public Citizen(String name, String adharno, String city, long mno) {
		super();
		this.name = name;
		this.adharno = adharno;
		this.city = city;
		this.mno = mno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharno=" + adharno + ", city=" + city + ", mno=" + mno + "]";
	}
	
	
	
	
}
