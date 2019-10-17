package com.infoud.ecommerece.shoppingcart;

import java.util.LinkedList;
import java.util.List;

import com.infoud.ecommerce.user.Customer;

public class RequestOrder extends Order {

	private Customer customer;
	private int orderId;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/*
	 * public RequestOrder(int orderId, String orderStatus, Product product) {
	 * super(orderId, orderStatus, product); }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestOrder other = (RequestOrder) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RequestOrder [customer=" + customer + ", orderId=" + orderId
				+ ", getProduct()=" + getProduct() + "]";
	}

}
