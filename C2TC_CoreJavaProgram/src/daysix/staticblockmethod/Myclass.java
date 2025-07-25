package daysix.staticblockmethod;

public class Myclass {
	private int section ; 
	private static int srNo; 
	
	static
	{
		System.out.println("-----------Within Static Block---------");
		srNo=1000;
	}
	

	void MyClass()
	{
		System.out.println("--------------Within Default Constructor-----------");
		srNo++;
		section++;		
	}
	
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}

	
	static void display() 
	{
	
		System.out.println("Serial No. "+srNo); 
	}

}
