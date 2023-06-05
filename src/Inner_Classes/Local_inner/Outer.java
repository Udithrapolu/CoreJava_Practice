package Inner_Classes.Local_inner;

public class Outer {

	void f1() {
		System.out.println("Inside Outer f1()");
		class LocalInner{
			void f2() {
				System.out.println("Inside local inner f2()");
			}
		}
		LocalInner  inner =new LocalInner();
		inner.f2();
	}
	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.f1();

	}

}
