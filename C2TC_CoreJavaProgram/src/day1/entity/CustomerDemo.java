package day1.entity;

public class CustomerDemo {

	public static void main(String[] args) {
		
		//getter and setter
		
		System.out.println("Getter and Setter method");
		
		Customer c1=new Customer();
		c1.setId(101);
		c1.setCname("Raju");
		c1.setCity("PDY");
		System.out.println("Customer Id: "+c1.getId());
		System.out.println("Customer Id: "+c1.getCname());
		System.out.println("Customer Id: "+c1.getCity());
		
		//toString
		
		System.out.println("toString method");
		
		Customer c2=new Customer();
		c2.setId(102);
		c2.setCname("Manu");
		c2.setCity("VPM");
		
		System.out.println(c2);        
		

	}
 
}
