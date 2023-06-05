package Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo_usingRandom {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		Random ran = new Random();
		
		
		for(int i=0;i<=10;i++)
		{
			int no= ran.nextInt(5);
			list.add(no);
		}
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<Integer>(list);
		
		System.out.println(set);
	}

}
