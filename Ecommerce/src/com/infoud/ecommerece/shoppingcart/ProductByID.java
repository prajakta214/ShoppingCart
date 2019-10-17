package com.infoud.ecommerece.shoppingcart;

import java.util.List;

public class ProductByID extends Storage {

	public Product getProductById(int productId) {

		Product product = null;
		List<Product> pList = new Storage().getCart();
		for (Product product2 : pList) {
			if (product2.getProductId() == productId) {
				product = product2;
				break;
			}
		}

		return product;

	}

}
