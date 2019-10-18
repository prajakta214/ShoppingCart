package com.infoud.ecommerce.user;

import java.util.List;
import java.util.Map;

import com.infoud.ecommerece.shoppingcart.Order;
import com.infoud.ecommerece.shoppingcart.OrderFunction;
import com.infoud.ecommerece.shoppingcart.Product;
import com.infoud.ecommerece.shoppingcart.RequestOrder;
import com.infoud.ecommerece.shoppingcart.ViewPlacedOrder;
import com.infoud.ecommerece.shoppingcart.placeOrder;

public class Customer extends User {

	private int custId;
	private String address;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * public Customer(int id, String name, String role) { super(id, name,
	 * role); // TODO Auto-generated constructor stub }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + custId;
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
		Customer other = (Customer) obj;
		if (custId != other.custId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ",name=" + getName() + "]";
	}

	//OrderFunction orderFunction = new OrderFunction();
placeOrder pOrder = new placeOrder();
	
	
	public void buyProduct(Order order) {
		
		pOrder.requestOrder(order);
		
	}
ViewPlacedOrder viewPlacedOrder=new ViewPlacedOrder();
	public void viewRequestedOrder() {
		viewPlacedOrder.viewPlacedOrder();
	}
}
