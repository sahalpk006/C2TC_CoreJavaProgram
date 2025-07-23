package daythree.constructor;

public class customer {
	private int id;
	private String name;
	private String city;
	
	public customer()   //default constructor
	{
		this.id=100;
		this.name="sahal";
		this.city="pdy";
	}
	
	public customer(int id,String name,String city)  //parameterized constructor
	{
		
		//this()  calling default constructor
		this("rakesh","chennai");  // # only can call one constructor 1.write in first  2.calling the second parameter in first parameter
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public customer(String name,String city)  // two paramterized constructor
	{
		
		this.name=name;
		this.city=city;
		
		System.out.println("2nd Parameterized called");
	}

}
