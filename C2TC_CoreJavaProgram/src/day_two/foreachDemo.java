package day_two;

public class foreachDemo {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		for(int i:array) {
			System.out.print(i);
		}
		System.out.println(" ");
		
		char c[]= {'a','b','c'};
		for(char i:c) {
			System.out.print(i);
		}
		System.out.println(" ");
		
		String s[]= {"Hello","World","Welcome"};
		for(String i:s) {
			System.out.print(i+" ");
		}

	}

}
