package polymorphism_overriding;

public class OverrideDemo {

	public static void main(String[] args) {
		
		
		//late binding,dynamic binding,runtime
		//base class
		PLTraining p1=new PLTraining();
		p1.session("FUllstack Developer ");
		
		//JFC object
		p1=new JFS();
		p1.session("Method overiding");
		
		//python object
		p1=new python();
		p1.session("Method overiding");
		

	}

}
