package com.infoud.ecommerece.shoppingcart;

import java.util.List;

public class OrderFunction extends Storage {

	public List<Order> requestOrder(Order order) {
		orderList.add( order);
		return orderList;

	}

	public void viewRequestedOrders() {
		System.out.println("Requested order::");
		for (Order order : orderList) {
			System.out.println("\t" + order);
		}
	}

	public Order getOrderById(int orderId) {

		Order order = null;
		List<Order> oList = getOrderList();
		for (Order o1 : oList) {
			if (o1.getOrderId() == orderId) {
				order = o1;
				break;
			}
		}

		return order;

	}

	public void removeOrderByID(int orderId) {
		Order order = getOrderById(orderId);
		deleteOrder(order);
	}

	private void deleteOrder(Order order) {

       sellOrder(order);
		orderList.remove(order);
		

	}
	
	public List<Order> sellOrder(Order order) {

		sellList.add(order);
		return sellList;

	}
	
	public void viewSellOrder() {
		System.out.println("Sells List is empty? "+sellList.isEmpty());
		System.out.println("Sells ::");
		for (Order order : sellList) {
			System.out.println("\t" + order);
		}
	}
}
