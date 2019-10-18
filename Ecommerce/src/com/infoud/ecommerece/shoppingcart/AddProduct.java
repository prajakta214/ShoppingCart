package com.infoud.ecommerece.shoppingcart;

import java.util.List;




public class AddProduct{

	 public void addProduct(Product product){
		 Storage.cart.put(product.getProductId(), product);
		 
	 }
	 
	 
	 
}
