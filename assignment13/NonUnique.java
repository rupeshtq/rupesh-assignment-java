package assignment13;

import java.util.ArrayList;
import java.util.LinkedList;

public class NonUnique {
	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("sun");
		list1.add("mon");
		list1.add("sun");
		list1.add("tue");
		list1.add("wed");
		list1.add("mon");
		System.out.println("list 1");
		
			System.out.println(list1);
		
		LinkedList<String>list2=new LinkedList<String>();
		
	String a="";
	String b="";
		for(int i=0;i<list1.size();i++)
		{
			for(int j=0;j<list1.size();j++)
			{
				a=list1.get(i);
				b=list1.get(j);
				if(a.equals(b)&& i<=j)
				{
					//list1.remove(i);
					list2.add(list1.get(j));
				}
				else list1.remove(i);
					
			}
			
		}
		System.out.println("list 2");
		System.out.println(list2);
			
			
				
		

		
	}

}
