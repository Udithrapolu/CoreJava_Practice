package IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reader_and_Writer {

	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(new File("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo"));
		fw = new FileWriter(new File("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo2"));
		int ch;
		while((ch=fr.read())!=-1)
		{
			fw.write(ch);
		}
		fr.close();
		fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
