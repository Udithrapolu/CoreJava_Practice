package Wrapper_Class;

public class String_Object {

	public static void main(String[] args) {
		
		long x= 100;
		Long y = Long.valueOf(x);
		String s = y.toString();
		Long z = Long.valueOf(s);
		System.out.println(z);
	}

}
