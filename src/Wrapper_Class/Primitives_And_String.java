package Wrapper_Class;

public class Primitives_And_String {

	public static void main(String[] args) {

		byte x = 100;
		String s = Byte.toString(x);
		byte y = Byte.parseByte(s);
		System.out.println(y);
	}

}
