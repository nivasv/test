package nivas.mt;

import java.util.*;
public class ObjectSorting {
	
	
	public static void main(String args[]){
		
		Order o1 = new Order(1,22,new Region(),new Date(),false,100,"Ab");
		Order o2 = new Order(2,5,new Region(),new Date(),true,22.52,"Abc");
		Order o3 = new Order(3,21,new Region(),new Date(),true,22.56,"AbB");
		Order o4 = new Order(4,2,new Region(),new Date(),true,22.52,"Ab");
		Order o5 = new Order(5,5,new Region(),new Date(),false,21.52,"Ab");
		
		List<Order> orderList = new ArrayList<Order>();
		orderList.add(o1);
		orderList.add(o2);
		orderList.add(o3);
		orderList.add(o4);
		orderList.add(o5);
		
		//orderList.sort(new ObjectComparator());
		
		//long time = 1483393620000;
		o1.expectedTime.setTime(1483393620000L); // jan 2 9.47 pm
		o2.expectedTime.setTime(1483349400000L); // jan 2 9.30 am
		o3.expectedTime.setTime(1485941400000L); // feb 1 9.30 am
		o4.expectedTime.setTime(1485985200000L); // feb 1 9.40 pm
		o5.expectedTime = new Date();
		
		System.out.println(o1.expectedTime.compareTo(o3.expectedTime));
		
		Set<Order> treeOrder = new TreeSet<Order>(new ObjectComparator());
		treeOrder.addAll(orderList);
		
		PriorityQueue<Order> queueOrder = new PriorityQueue<Order>(new ObjectComparator());
		queueOrder.addAll(orderList);
		
		Collections.sort(orderList,new ObjectComparator());
		
		
		//System.out.println(o1.expectedTime.getTime());
		
		//Arrays.parallelSort(orderList);
		System.out.println("Arraylist sort");
		for(Order o : orderList){
			
			System.out.println("Orderid :" + o.orderId + " quantity: " + o.totalQuantity + " shipcost: " + o.costToShip + " mode: " + o.mode);
		}
		System.out.println();
		//test.
		for(Order o : queueOrder){
			//System.out.println("Tree Set");
			System.out.println("Orderid :" + o.orderId + " quantity: " + o.totalQuantity + " shipcost: " + o.costToShip + " mode: " + o.mode);
		}
		
		int queueSize = queueOrder.size();
		System.out.println();
		System.out.println("Heap sort");
		for(int i=0; i<queueSize;i++){
			Order o = queueOrder.poll();
			//System.out.println(i);
			System.out.println("Orderid :" + o.orderId + " quantity: " + o.totalQuantity + " shipcost: " + o.costToShip + " mode: " + o.mode);
		}
		
	}

}
