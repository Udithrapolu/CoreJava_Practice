package IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EventObject;
import java.util.Scanner;

public class Testing {
	
	public static void main(String[] args) 
	{
	FileWriter fw = null;
	String text = null;
	
	try {
		fw = new FileWriter(new File("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo2"));
		System.out.println("Enter the text :");
		
		StringBuffer string  = new StringBuffer("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo2");
		Scanner scan = new Scanner(System.in);

		
		
		do {
			text = scan.nextLine();	
//			fw.append(text);
//			StringBuffer s = string.append(text);
//			String s = "/n";
			 fw.write(text);
//			 fw.write(s);
			
		}while(!text.isEmpty());
		
		System.out.println("Text is saved");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
			

}
}