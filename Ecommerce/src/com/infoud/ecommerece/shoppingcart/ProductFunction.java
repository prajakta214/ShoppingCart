package com.infoud.ecommerece.shoppingcart;

import java.util.List;
import java.util.Map;

public class ProductFunction extends Storage {

	
	public void addProduct(Product product){
		 Storage.cart.put(product.getProductId(), product);
		 
	 }
	 
	
	public void viewCartItems() {
		
		System.out.println("View Cart Items::");
		for (Map.Entry<Integer, Product> entry : Storage.cart.entrySet()) {
			System.out.println("Product Id:: " + entry.getKey() + " product  Details :: " + entry.getValue());
		}
	}

	public Product getProductById(int productId) {

		Product product = null;
		Map<Integer,Product> prod = Storage.getCart();
	       for (Map.Entry<Integer, Product> entry : prod.entrySet()) {
	    	   if(entry.getKey().equals(productId)) {

	    	   product = entry.getValue();
	    	               System.out.println("product:+"+product);
	    	                  break;
	    	              }
	    	          }
	    	          
		

		return product;

	}
	public void removeProductByPID(int productId) {
		System.out.println();
		System.out.println("Product to delete:: " +productId);
		Product prod = getProductById(productId);
		
		deleteProduct(prod);
	}
	
	public void deleteProduct(Product product){
		Storage.cart.remove(product.getProductId());
		System.out.println();
	}
}
