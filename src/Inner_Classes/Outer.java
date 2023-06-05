package Inner_Classes;

public class Outer {
	static void f1() {
		System.out.println("Outer static mehtod");
	}
	static class inner{
		static void f2() {
			System.out.println("Inner static method");
		}
	}

	public static void main(String[] args) {
		Outer.f1();
		Outer.inner.f2();

	}

}
