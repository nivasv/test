package nivas.mt;


import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class SetExample {

	public static void main(String args[]){
	
	
		SetExample sol = new SetExample();
        Comparator<Integer> comparator = sol.new StringLengthComparator();
		Set<Integer> test = new HashSet<Integer>();
		test.add(1);
		test.add(4);
		test.add(3);
		test.add(5);
		
		//test.add(null);  // NULL allowed in hashset but not in treeset
		System.out.println(test);
		NavigableSet<Integer> test1 = new TreeSet<Integer>(new IntegerComparator());
		test1.addAll(test);
		
		System.out.println("Sorted set:" + test1);
		System.out.println(test1.pollFirst());
		System.out.println(test1.last());
		Set<Integer> test2 = new LinkedHashSet<Integer>(10,0.75f);  // 10 is the initial capacity
		test2.addAll(test1);
		System.out.println(test2);
		System.out.println(test1.headSet(3,true));
		System.out.println(test1.tailSet(3));
	    System.out.println(test1.comparator());
		for(Integer te : test1){
			System.out.println(te);
		}
		
		Map<Integer,Integer> map = new ConcurrentHashMap<Integer,Integer>();
		map.put(1,1);
		map.put(2,1);
		map.put(3,2);
		map.put(4,2);
		
		Set<Integer> test3 = ConcurrentHashMap.newKeySet(); // synchronized hashset
		System.out.println(test3);
	}
	
	public class StringLengthComparator implements Comparator<Integer>
	{
	    @Override
	    public int compare(Integer x, Integer y)
	    {
	        // Assume neither string is null. Real code should
	        // probably be more robust
	        // You could also just return x.length() - y.length(),
	        // which would be more efficient.
	      
	      // return y -x;
	        if (x > y )
	        {
	            return -2;
	        }
	        if (x < y)
	        {
	            return 3;
	        }
	        return 0;
	    }
	}
	}

