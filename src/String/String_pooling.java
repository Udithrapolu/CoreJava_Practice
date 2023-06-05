package String;

public class String_pooling {

	public static void main(String[] args) {

		Product p1 = new Product(1, "abc");
		Product p2 = new Product(2, "abc");

		System.out.println(p1);
		System.out.println(p2);

		

		String s1 = "xyz";
		String s3 = "xyz";
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		String a1 = new String("xyz");
		System.out.println(a1.hashCode());
		
//		
//		System.out.println(s2.hashCode());
//		System.out.println(s1.hashCode());
//
//		System.out.println(s1 == s3);
//		System.out.println(s1.equals(s3));
	}
}
