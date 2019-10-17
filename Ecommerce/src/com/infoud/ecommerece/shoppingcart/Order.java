package com.infoud.ecommerece.shoppingcart;

public class Order {

	private int orderId;
	/*
	 * private String orderStatus=null;
	 */private Product product;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/*
	 * public String getOrderStatus() { return orderStatus; } public void
	 * setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
	 */
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/*
	 * public Order(int orderId, String orderStatus, Product product) { super();
	 * this.orderId = orderId; this.orderStatus = orderStatus; this.product =
	 * product; }
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + "]";
	}

}
