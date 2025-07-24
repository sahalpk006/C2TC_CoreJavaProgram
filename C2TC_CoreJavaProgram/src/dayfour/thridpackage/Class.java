package dayfour.thridpackage;

public class Class {
	private static Class obj=new Class();
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private Class() {
		System.out.println("MyClass object created");		
	}
	
	public static Class getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "Class [id=" + id + "]";
	}
}
