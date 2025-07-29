package day8.interfaceExaamples.Mall;

public class FoodCart implements Dmart {
	
	@Override
	public void purchase() {
		System.out.println("Customer "+entry);
		System.out.println("Brought foods to eat");
	}

}
