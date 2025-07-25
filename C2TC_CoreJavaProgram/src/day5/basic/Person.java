package day5.basic;

public class Person {
	private int pid;
	private String name;
	private String city;
	
	
	
	
	public Person() {
		super();
		
	}
	
	
	
	public Person(int pid, String name, String city) {
		super();
		this.pid = pid;
		this.name = name;
		this.city = city;
	}



	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
