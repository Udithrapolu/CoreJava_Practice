package Access_Modifiers;

public class Proctected extends Private {
	
	public static void main(String[] args) {
		
		Private object = new Private();
//		System.out.println(object.a); error
		System.out.println(object.b);
		System.out.println(object.c);
		System.out.println(object.d);
	}

}
