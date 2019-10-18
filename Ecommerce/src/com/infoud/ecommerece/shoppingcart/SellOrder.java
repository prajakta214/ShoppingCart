package com.infoud.ecommerece.shoppingcart;

public class SellOrder extends OrderById {

	public void removeOrderByID(int orderId) {
		Order order1 = getOrderById(orderId);

		deleteOrder(order1);
	}

	UpdateProduct updateProduct = new UpdateProduct();

	private void deleteOrder(Order order) {

		Storage.orderList.remove(order.getOrderId());
		Storage.sellList.put(order.getOrderId(), order.getProduct());
		updateProduct.updateProductQuantity(order.getProduct(), 1);
	}

}
