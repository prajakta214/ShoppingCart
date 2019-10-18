package com.infoud.ecommerece.shoppingcart;

import java.util.List;
import java.util.Map;

public class ProductByID {

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

}
