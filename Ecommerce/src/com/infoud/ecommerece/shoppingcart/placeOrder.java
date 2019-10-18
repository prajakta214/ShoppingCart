package com.infoud.ecommerece.shoppingcart;


public class placeOrder {


	public Order requestOrder(Order order) {

		return Storage.orderList.put(order.getOrderId(), order);
	}
}
