package day2.constructor;

public class Customer {

	private int id;
	private String name;
	private String city;
	
	public Customer()   //default constructor
	{
		this.id=100;
		this.name="sahal";
		this.city="pdy";
	}
	
	public Customer(int id,String name,String city)  //parameterized constructor
	{
		
		//this()  calling default constructor
		this("rakesh","chennai");  // # only can call one constructor 1.write in first  2.calling the second parameter in first parameter
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public Customer(String name,String city)  // two paramterized constructor
	{
		
		this.name=name;
		this.city=city;
		
		System.out.println("2nd Parameterized called");
	}
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}


