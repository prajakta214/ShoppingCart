package com.infoud.ecommerece.shoppingcart;

import java.util.List;




public class AddProduct extends  Storage{

	 public List<Product> addProduct(Product product){
		 cart.add(product);
		return cart;
		 
	 }
	 
	 
	 
}
