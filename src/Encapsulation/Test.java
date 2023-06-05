package Encapsulation;

public class Test {
	public static void main(String[] args) {
		
		Patient p = new Patient();
		p.setId(1);
		p.setName("udith");
		p.setSsn(8394);
		
		System.out.println("ID : "+p.getId());
		System.out.println("name : "+p.getName());
		System.out.println("SSN : "+p.getSsn());
	}

}
