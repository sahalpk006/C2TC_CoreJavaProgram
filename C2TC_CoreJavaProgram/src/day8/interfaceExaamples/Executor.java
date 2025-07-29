package day8.interfaceExaamples;

public class Executor {

	public static void main(String[] args) {
		
		//College reference
		College c1;
		
		//Cse Student
		c1=new CseStudents();
		c1.session();
		
		//It Student
		c1=new ItStudents();
		c1.session();

	}

}
