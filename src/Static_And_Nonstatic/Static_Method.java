package Static_And_Nonstatic;

public class Static_Method {
	
	static void method() {
		
		System.out.println("this is static method");//executed when is declared in main class
	}
	void Non_static() {
		System.out.println("this is non static mehtod");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		method();
		
		Static_Method s = new Static_Method();
		s.Non_static();

	}

}
