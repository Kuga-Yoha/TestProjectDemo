package code;

public class Subject {
	
	private String subName;
	private int credits;
	
	public Subject(String subName, int credits) {
		super();
		this.subName = subName;
		this.credits = credits;
	}
	
	
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	

}
