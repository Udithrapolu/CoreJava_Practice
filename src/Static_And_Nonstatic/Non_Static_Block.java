package Static_And_Nonstatic;

public class Non_Static_Block {
	
	{
		System.out.println("this is non-static block");//executed when class object is created
	}

	public static void main(String[] args) {
		
		System.out.println("this is main class");
		Non_Static_Block object = new Non_Static_Block();
	}

}
