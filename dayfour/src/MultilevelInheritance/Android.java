package MultilevelInheritance;

//child class
public class Android extends Nokia {
	private String version;
	private void accept() {
		System.out.println("The android version name is:" + version);
	}
	
	//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public void Android() {
		super();
	}

	public Android(String version) {
		super();
		this.version = version;
	}
	
	

}
