package com.infoud.ecommerece.shoppingcart;

public class UpdateProduct {
	
	public void updateProductQuantity(Product product, int quantity){
		product.setProductQuantity(product.getProductQuantity()-1);
	}
	
	public void updateProductPrice(Product product, double price){
		product.setProductPrice(price);
	}

}
