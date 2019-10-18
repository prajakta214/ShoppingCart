package com.infoud.ecommerece.shoppingcart;

import java.util.List;
import java.util.Map;

public class OrderFunction extends Storage {

	public Order requestOrder(Order order) {

		return Storage.orderList.put(order.getOrderId(), order);
	}
	
	
public void viewPlacedOrder() {
		
		System.out.println("View Placed Orders::");
		for (Map.Entry<Integer, Order> entry : Storage.orderList.entrySet()) {
			System.out.println("Order Id:: " + entry.getKey() + " Order  Details :: " + entry.getValue());
		}
	}


public Order getOrderById(int orderId) {

	Order order = null;
	Map<Integer,Order> order1 = Storage.getOrderList();
       for (Map.Entry<Integer, Order> entry : order1.entrySet()) {
    	   if(entry.getKey().equals(orderId)) {

    	   order = entry.getValue();
    	               System.out.println("product:+"+order);
    	                  break;
    	              }
    	          }
    	          
	

	return order;
}

public void removeOrderByID(int orderId) {
	Order order1 = getOrderById(orderId);

	deleteOrder(order1);
}

private void deleteOrder(Order order) {

	Storage.orderList.remove(order.getOrderId());
}

	
}
