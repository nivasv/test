package nivas.mt;

import java.util.*;
public class ObjectComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2){     // to maintain relative ordering i.e. stable sort
		if(o1.totalQuantity < o2.totalQuantity){
			return -1;
		}
		if(o1.totalQuantity > o2.totalQuantity){
			return 1;
		}
		return o1.orderId - o2.orderId;
	}
	
	@Override									// standard sort.. unstable sort... ascending
	public int compare(Order o1, Order o2){
		return o1.totalQuantity - o2.totalQuantity;
	}
	
	@Override									// sort string ... Upper case is given more priority
	public int compare(Order o1, Order o2){
		return o1.mode.compareTo(o2.mode);
	}
	
	@Override									// sort string by single value ....i.e Ab will be in front
	public int compare(Order o1, Order o2){
		if (o2.mode == "Ab"){
			return 1;
		}
		return -1;
	}
	
	@Override									// sort string by single value ....i.e Ab will be in front
	public int compare(Order o1, Order o2){
		if (o2.costToShip > 21.52){
			return 1;
		}
		return -1;
	}
	
	@Override									// to sort boolean
	public int compare(Order o1, Order o2){
		return (o1.unFulfilled == o2.unFulfilled ? 0 : (o2.unFulfilled ? 1 : -1));  // it returns true first
	}

	
	@Override									// to sort date .... earliest to latest
	public int compare(Order o1, Order o2){
		return o1.expectedTime.compareTo(o2.expectedTime);
	}
	
	
	
	@Override
	public int compare(Product p1,Product p2){		// encapsulated sort
		return p1.getProductId() - p2.getProductId();
	}
}
