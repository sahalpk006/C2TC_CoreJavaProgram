package polymorphism_overriding;




class College
{
	protected College getobj(){
		return new College();
	}
}

class Student
{
	public Student getobj(){
		return new Student();
	}
}


public class StudentDemo {

	public static void main(String[] args) {
		

	}

}
