package assignment13;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class TestCust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<Customer>list=new LinkedList<Customer>();
			list.add(new Customer(1, 968949923, "Akash"));
			list.add(new Customer(2, 968947654, "Yogesh"));
			list.add(new Customer(3, 968946543, "Gaurav"));
			list.add(new Customer(4, 967549923, "Ashish"));
			list.add(new Customer(5, 968949923, "Akash"));
			System.out.println("Customer Details Using Iterator");
			Iterator<Customer>itr= list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println();
			System.out.println("CustomerDetails Using ForLoop");
			for(Customer c:list)
				System.out.println(c);
			System.out.println();
			
			System.out.println("CustomerDetails Using forEach");
			list.forEach((t)->System.out.println(t));
			System.out.println();
			
			
		//	Sort LinkedList created in Q3 by custId in ascending order .
			System.out.println("---CustomerDetails SortByCustId ");
			Collections.sort( list,new SortByCustId());
			list.forEach((t)->System.out.println(t));
			System.out.println();
		
			/*
			 * Sort LinkedList in Q3 by custName in ascending order,
			 * if custNames are same then sort that objects further by custId in descending order.
			 */
			System.out.println();
			System.out.println("sort by custName ascending,if name same sort by custId dscending");
			Collections.sort(list);
			list.forEach((t)->System.out.println(t));

	}

}
class SortByCustId implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getCustId()-o2.getCustId();
	}
	
}
