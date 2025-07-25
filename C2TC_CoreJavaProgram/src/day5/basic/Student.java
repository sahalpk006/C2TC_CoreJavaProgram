package day5.basic;

public class Student extends Person {
	private int uid;
	private String courseName;
	
	
	//----------------------------  Add this for getting in Executor ------------------------------------
	
	public Student() {
		super();
		
	}
	public Student(int pid, String name, String city,int uid,String courseName) {
		super(pid, name, city);
		this.uid=uid;
		this.courseName=courseName;
		
	}
	
	
	//-----------------------------------------------------------
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return "Student [ Stuent id=" + super.getPid() 
		+"Name :"+super.getName()
		+"City :"+super.getCity()
		+"UID :"+ uid
		+ ", courseName=" + courseName + "]";
	}
	
	
	
}
