package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Testing2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo3.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new  ObjectInputStream(fis);
		Object obj = ois.readObject();
		
//		int i =ois.read();
		String c = obj.toString();
		System.out.println(c);
	}

}
