package com.infoud.ecommerece.shoppingcart;

import java.util.List;
import java.util.Map;

public class OrderById {
	
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

}
