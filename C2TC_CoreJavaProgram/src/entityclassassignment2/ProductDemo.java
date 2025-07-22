package entityclassassignment2;



public class ProductDemo {

	public static void main(String[] args) {
		System.out.println("Product Details");
		System.out.println("-----------------");
		
		Product p1=new Product();
		p1.id=101;
		p1.name="mug";
		p1.price=25;
		
		System.out.println("Product Id: "+p1.id);
		System.out.println("Product name: "+p1.name);
		System.out.println("Product price: "+p1.price);
		
		System.out.println("-----------------");
		
		Product p2=new Product();
		p2.id=101;
		p2.name="GLass";
		p2.price=250;
		
		System.out.println("Product Id: "+p2.id);
		System.out.println("Product name: "+p2.name);
		System.out.println("Product price: "+p2.price);

	}

}
