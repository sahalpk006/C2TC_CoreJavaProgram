package daythree.scanner;

import java.util.Scanner;

public class personDemo {

	public static void main(String[] args) {
		Scanner ob=new Scanner (System.in);
		
		String name;
		System.out.println("ENter Person name: ");
		name=ob.next();
		System.out.println("ENter Person AGe: ");
		int age=ob.nextInt();
		System.out.println("ENter Person Gender: ");
		String gender=ob.next();
		System.out.println("ENter Person Income: ");
		int income=ob.nextInt();
		
		
		person p=new person();
		p.setName(name);
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);

		
		
		System.out.println(p);
		
		taxCalculation calc=new taxCalculation();
		calc.calculateTax(p);
		System.out.println("Ater Tax: ");
		System.out.println(p);
		
		ob.close();
	}

}
