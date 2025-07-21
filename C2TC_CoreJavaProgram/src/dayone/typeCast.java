package dayone;

public class typeCast {

	public static void main(String[] args) {
		byte b= 10;
		int i= b;
		System.out.println(i);
		
		float f= 22.14f;
		double d= f;
		System.out.println(d);
		
		char ch= 'A';
		int v= ch;
		System.out.println(v);
		
		char var = '\u00A7';
		int u = var;
		System.out.println(u);
		
	

		double f1 = 10.52f;
		long longes = (long) f1;
		System.out.println(longes);

		long l1 = 923372036854775806l;
		int w = (int) l1;
		System.out.println(w);

		float f2 = 34.56f;
		int z = (int) f2;
		System.out.println(z);

		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println(ch1);

	}

}
