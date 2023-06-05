package Access_Modifiers;

public class Private {
	
	private int a = 30;
	int b= 40;
	protected int c = 20;
	public int d = 60;

	public static void main(String[] args) {
		
		Private object = new Private();
		System.out.println(object.a);
		System.out.println(object.b);
		System.out.println(object.c);
		System.out.println(object.d);
		
	}

}
