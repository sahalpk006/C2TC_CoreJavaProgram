package day1.basic;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of A="+a+" B="+b+" is="+c);

	}

}
