package String;

public class StringDemo {

	public static void main(String[] args) {

		String s = "string";
		String s1 = new String("String");
		System.out.println(s1);
		char c[] = {'i','y','t','w'};
		String s2 = new String(c);
		System.out.println(s2);
		byte b[] = {4,5,6,66};
		String s3=new String(b);
		System.out.println(s3);
	}

}
