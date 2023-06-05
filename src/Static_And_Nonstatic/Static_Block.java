package Static_And_Nonstatic;

public class Static_Block {

	static {
		System.out.println("this is static block");// executed before main method
	}

	public static void main(String[] args) {
		
		System.out.println("this is main block");
	}

}
