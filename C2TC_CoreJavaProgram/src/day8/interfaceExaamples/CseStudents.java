package day8.interfaceExaamples;

public class CseStudents implements College{
	
	@Override
	public void session() {
		System.out.println(" To reach the college before "+starttime);
		System.out.println("And attend the TNS CG CSR Program");
	}

}
