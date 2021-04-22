package code;

public class Student {

	
	private int stuId;
	private String name;
	
	public Student() {
		
	}

	/**
	 * @param stuId
	 * @param name
	 */
	public Student(int stuId, String name) {
		super();
		this.stuId = stuId;
		this.name = name;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	
}
