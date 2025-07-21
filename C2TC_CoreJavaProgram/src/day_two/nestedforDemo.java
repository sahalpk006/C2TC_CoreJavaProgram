package day_two;

public class nestedforDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;

		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}

	}

}
