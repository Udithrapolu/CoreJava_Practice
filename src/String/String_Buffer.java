package String;

public class String_Buffer {

	public static void main(String[] args) {

		StringBuffer s = new StringBuffer();
		
		s.append(" welcome ");
		s.append("udith ");
		
		String s1= new String(s);
		System.out.println(s);
		
		String[] result = s1.split(" ");
		
		for (String string : result) {
			
			System.out.println(string);
		}
		System.out.println(s1.replace(" ", "_"));
		
	}

}
