package com.infoud.ecommerece.shoppingcart;

import java.util.Map;

public class ViewProduct {

	public void viewCartItems() {
		System.out.println("View Cart Items::");
		for (Map.Entry<Integer, Product> entry : Storage.cart.entrySet()) {
			System.out.println("Product Id:: " + entry.getKey() + " product  Details :: " + entry.getValue());
		}
	}
}
