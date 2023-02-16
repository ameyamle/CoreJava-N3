package org.tnsif.singlelevelinheritance;

public class Student extends Citizen{
	private int rollno;
	private String studname;
	
	//Getters and Setters method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	
	//Constructor
	public Student() {
		super();
	}
	public Student(String name, String adharno, String city, long mno) {
		super(name, adharno, city, mno);
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + "]";
	}
	
		
	
}
