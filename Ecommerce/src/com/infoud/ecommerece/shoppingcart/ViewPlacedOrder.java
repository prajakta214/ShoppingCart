package com.infoud.ecommerece.shoppingcart;

import java.util.Map;

public class ViewPlacedOrder {
	public void viewPlacedOrder() {
		
		System.out.println("View Placed Orders::");
		for (Map.Entry<Integer, Order> entry : Storage.orderList.entrySet()) {
			System.out.println("Order Id:: " + entry.getKey() + " Order  Details :: " + entry.getValue());
		}
	}


}
