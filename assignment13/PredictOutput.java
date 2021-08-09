package assignment13;

import java.util.LinkedList;
import java.util.List;

public class PredictOutput {
	public static void main(String[] args) {
		List list1 = new LinkedList<>();
		list1.add("Me");
		list1.add("You");
		list1.add("He");
		list1.add("She");
		list1.add("It");
		
		
		List list2 = new LinkedList();
		list2.add("You");
		list1.retainAll(list2);
	//	for (String temp : list1) //ype mismatch: cannot convert from element type Object to String
		//System.out.printf(temp + " " );
		System.out.println(); 
		}

}
