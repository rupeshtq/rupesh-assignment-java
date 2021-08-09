package assignment13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class TestEmp {
public static void main(String[] args) {
		
		ArrayList<Employee>list1=new ArrayList<Employee>();
		System.out.println("Emp list 1");
		list1.add(new Employee(1, "sagar", 25000));
		list1.add(new Employee(2, "ramesh", 20000));
		list1.add(new Employee(3, "gokul", 35000));
		list1.add(new Employee(4, "nilesh", 30000));
		list1.add(new Employee(5, "akash", 45000));
		list1.forEach((t)->System.out.println(t));
		ArrayList<Employee>list2=new ArrayList<Employee>();
		System.out.println("Emp list 2");
		
		list2.add(new Employee(6, "yogesh", 55000));
		list2.add(new Employee(7, "akash", 50000));
		list2.add(new Employee(8, "akash", 55000));
		list2.add(new Employee(9, "hardik", 60000));
		list2.add(new Employee(10, "kiran", 75000));
		list2.forEach((t)->System.out.println(t));
		System.out.println();
		list1.addAll(list2);
		System.out.println("list 1 & list 2 added in LinkedList");
		LinkedList<Employee>linkedlist=new LinkedList<Employee>();
		linkedlist.addAll(list1);
		linkedlist.forEach((t)->System.out.println(t));
		System.out.println();
		
		System.out.println();
		Collections.sort(linkedlist, new SortBySalaryNameId());
		linkedlist.forEach((t)->System.out.println(t));
	}

}
class SortBySalaryNameId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o2.getEmpSalary()-o1.getEmpSalary()==0)
		{
			if(o2.getEmpName().equals(o1.getEmpName()))
			{
				return o2.getEmpId()-o1.getEmpId();
			}
			else return o2.getEmpName().compareTo(o1.getEmpName());
		}
		else return (int) (o2.getEmpSalary()-o1.getEmpSalary());
	}
	
}