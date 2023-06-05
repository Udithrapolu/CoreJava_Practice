package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list  = new ArrayList<>();
		
		for(int i=10;i<=100;i=i+10)
		{
			list.add(i);
		}
		
		System.out.println("List :"+list);
		list.add(2, 100);
		System.out.println("List after replace :"+list);
		
		for(int integer=0;integer<list.size();integer++) {
//			if(list.get(integer).equals(10))
//			{
//				list.set(integer, 233);
//				
//			}
			if(list.get(integer).equals(100)) {
				
			
//			int i = list.indexOf(integer);
//			System.out.println(i);
//			boolean i =list.contains(100);
			list.remove(list.get(integer));
			}
//			list.get(integer);
		}
		System.out.println("List :"+list);
		
		
		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		
		list.addAll(secondList);
		System.out.println(list);
		
		
		
		System.out.println(list);
	}
	

}
