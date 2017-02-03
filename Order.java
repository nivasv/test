package nivas.mt;

import java.util.*;
public class Order {

	public int orderId;
	public Map<Integer,Integer> cart;
	//public int totalQuantity;
	public Region destination;
	public Date expectedTime;
	public boolean unFulfilled;
	public double costToShip;
	public int totalQuantity;
	public String mode;
	
	public Order(int orderId,int totalQuantity,Region destination,Date expectedTime,boolean unFulfilled,double costToShip,String mode){
		this.orderId = orderId;
		this.totalQuantity = totalQuantity;
		this.destination = destination;
		this.expectedTime = expectedTime;
		this.unFulfilled = unFulfilled;
		this.costToShip = costToShip;
		this.mode = mode;
	}
}
