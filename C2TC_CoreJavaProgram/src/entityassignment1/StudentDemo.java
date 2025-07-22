package entityassignment1;



public class StudentDemo {

	public static void main(String[] args) {
		System.out.println("Student Details");
		System.out.println("-----------------");
		
		Student s1=new Student();
		s1.regno=101;
		s1.name="mugiland";
		s1.city="pdy";
		
		System.out.println("Student Id: "+s1.regno);
		System.out.println("Student name: "+s1.name);
		System.out.println("Student city: "+s1.city);
		
		System.out.println("-----------------");
		
		Student s2=new Student();
		s2.regno=102;
		s2.name="sahal";
		s2.city="vpm";
		
		System.out.println("Student Id: "+s2.regno);
		System.out.println("Student name: "+s2.name);
		System.out.println("Student city: "+s2.city);
		
		
		
		

	}

}
