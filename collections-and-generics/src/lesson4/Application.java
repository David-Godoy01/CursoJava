package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {

	public static void main(String[] args) {
	
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(new Employee("Mike", 3500, "Accounting"));
		hashSet.add(new Employee("Paul", 3000, "Admin"));
		hashSet.add(new Employee("Peter", 4000, "IT"));
		hashSet.add(new Employee("Angel", 2000, "Maint"));
		
		
		ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		

	}

}





//List<Integer> li = new ArrayList<Integer>(list1);
//
//ArrayList<Integer> newList = new ArrayList<Integer>();
//newList.add(10);
//newList.add(67);
//newList.add(15);
//
////list1.removeAll(newList);
////boolean hasValue =list1.contains(67);
////list1.clear();
////boolean hasValue = list1.isEmpty();
//
//list1.retainAll(newList);
//
//System.out.println(list1);
