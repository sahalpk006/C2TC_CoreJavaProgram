package day2.constructor;

public class CustomerDemo {

	public static void main(String[] args) {
		
		
		Customer c1=new Customer();
		System.out.println(c1);
		
		
		Customer c2=new Customer(102,"mug","vpm");
		System.out.println(c2);
		
		Customer c3=new Customer("mug","pdy");
		System.out.println(c3);

	}

}
