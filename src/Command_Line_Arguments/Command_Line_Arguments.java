package Command_Line_Arguments;

public class Command_Line_Arguments {

	public static void main(String[] args) {
		
		int length = args.length;
		
		if(length==0)
		{
			System.out.println("No Input Provided");
		}else
		{
			System.out.println("list of arguments");
			for(int i=0;i<length;i++)
			{
				System.out.println(args[i]);
			}
		}
	}

}
