package day2.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		String name;
		System.out.println("ENter name: ");
		name=br.readLine();
		
		int age;
		System.out.println("ENter age: ");
		age=Integer.parseInt(br.readLine());
		
		float avg;
		System.out.println("ENter Average: ");
		avg=Float.parseFloat(br.readLine());
		
		System.out.println("NAme :"+name+" age : "+age+" avg "+avg);
		
	}

}
