package MultilevelInheritance;

public class Nokia {
	//private data members
	private int modelno;
	private void display() {
		System.out.println("The model no is:s" + modelno);
	}
	
	//Default constructor
	public Nokia() {
		System.out.println("Nokia class");
	}
	
	//Parameterized constructor
	public Nokia(int modelno) {
		super();
		this.modelno = modelno;
	}
	
}
