package assignment13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Descending3Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("Akash");
		list.add("Yogesh");
		list.add("Jayant");
		list.add("Sagar");
		list.add("Ashish");
		list.add("Rajesh");
		list.forEach((t)->System.out.println(t));
		System.out.println();
		System.out.println("Sort using anonymous inner class");
		Comparator<String>li=new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		Collections.sort(list,li);
		list.forEach((t)->System.out.println(t));
		System.out.println();
		System.out.println("sort using Lambda function");
		Collections.sort(list, (e1,e2)->e2.compareTo(e1));
		list.forEach((t)->System.out.println(t));
		System.out.println();
		System.out.println("sort using compartor class");
		Collections.sort(list, new SortByName());
		list.forEach((t)->System.out.println(t));
		
	}

}
class SortByName implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}

