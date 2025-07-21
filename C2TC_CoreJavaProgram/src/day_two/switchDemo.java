package day_two;

public class switchDemo {

	public static void main(String[] args) {
		char m = 'M';
		switch (m) 
		{
		case 'A' : 
		case 'a' : 
			System.out.println(m+" is a Letter");
			break;
		case 'B':
		case 'b' :
			System.out.println(m+" is a Digit");
			break;
		case 'M':
		case 'm' :	
			System.out.println(m+" is White Space");
			break;
		case 'D':
		case 'd':
			System.out.println(m+" is Special Symbol");
		default:
			System.out.println(m+" is other than letters or  digit or space or special symbol ");
			break;
	}
	}
}
