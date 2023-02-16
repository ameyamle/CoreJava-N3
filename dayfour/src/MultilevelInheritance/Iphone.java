package MultilevelInheritance;

public class Iphone extends Android {
	private String slottype;
	private void slot() {
		System.out.println("Slot type is: " + slottype);
	}
	public String getslottype() {
		return slottype;
	}
	public void setslottype(String slottype) {
		this.slottype = slottype;
	}
	public Iphone(String version) {
		super(version);
	}
	

}
