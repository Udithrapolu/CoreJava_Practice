package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

public class Buffered {

	public static void main(String[] args) throws IOException {

		FileReader fr = null;
		InputStream is = null;
		BufferedReader br = null;
		BufferedInputStream bis = null;
		 
		int count = 0;
		
		try {
			
			is = new FileInputStream(new File("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo2"));

			fr = new FileReader(new File("C:\\Users\\UdithRapolu\\eclipse-workspace\\CoreJava\\src\\IOStream\\Demo2"));
			br = new BufferedReader(fr);
			bis = new BufferedInputStream(is);
			
			String line;
			line = br.readLine();
			while(line!=null)
			{
				StringTokenizer st = new StringTokenizer(line,",");
				while(st.hasMoreElements()) {
					System.out.println(st.nextToken());
					
				}
				count++;
				line = br.readLine();
			}
			System.out.println("Number of lines in the file are "+count);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fr.close();
			br.close();
		}
	}

}
