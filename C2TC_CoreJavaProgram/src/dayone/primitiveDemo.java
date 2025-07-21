package dayone;

public class primitiveDemo {

	public static void main(String[] args) {
		byte byteMaximum = 127;
		byte byteMinimum = -128;
		
		System.out.println("Minimum range of byte is" +byteMinimum+"Maximum range of byte is "+byteMaximum);
		
		
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("Minimum short range of byte is " +shortMin+" Maximum short range of byte is "+shortMax);
		
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Minimum int range of byte is " +minInt+" Maximum int range of byte is "+maxInt);
		
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("Minimum long range of byte is " +minLong+" Maximum long range of byte is "+maxLong);
		
		float f1=3234.141243278345f;
		double d1=3456.14124512345678902345678914f;
		System.out.println("float value is "+f1+" double value is "+d1);
		
		//boolean 
		boolean flags=false;
		System.out.println("boolean value is "+flags);

	}

}
