package nivas.mt;

import java.io.*;
import java.util.*;

public class ListExample {

	public static void main(String args[]){
		
		List<Integer> test = new ArrayList<Integer>();
		test.add(1);
		test.add(2);
		test.add(1,3); // add to the specified index
		test.set(1,4); // replace the element in that index
		//test.add(4,2);  // you cannot do it as it is out of bound
		test.add(5);
		
		//test.add(null);  // we can add duplicates in list
		System.out.println(test);
		Collections.sort(test); // natural ordering
		System.out.println(test);
		
		for(Integer i : test){
			System.out.println(i);
		}
		
		for(int i =0; i<test.size() ;i++){
		  System.out.println(test.get(i));
		}
		
		test.sort(new IntegerComparator());  // custom ordering
		System.out.println(test.hashCode());
		
		System.out.println(test);
		
		List<Integer> test2 = new LinkedList<Integer>(test);  //Linked list is of no use..except for add and remove in first and last
		System.out.println("Linked list is:" + test2);
		
		
		Integer[] test1 = new Integer[6];
		test.toArray(test1);  // convering list to arrays
		System.out.println("Converted to array:" + Arrays.toString(test1));
		
		
		
	}
}
