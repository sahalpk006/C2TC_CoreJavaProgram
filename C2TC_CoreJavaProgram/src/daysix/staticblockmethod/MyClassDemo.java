package daysix.staticblockmethod;

public class MyClassDemo {

	public static void main(String[] args) {
		Myclass o1 = new Myclass();
		System.out.println(o1);

		// static method with class name
		Myclass.display();

		Myclass o2 = new Myclass();
		System.out.println(o2);
		Myclass.display();
		Myclass o3 = new Myclass();
		System.out.println(o3);
		Myclass.display();

	}

}
