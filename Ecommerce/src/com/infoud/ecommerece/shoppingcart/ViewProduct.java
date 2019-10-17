package com.infoud.ecommerece.shoppingcart;

public class ViewProduct extends Storage{

	public void viewCart(){
		 for(Product product:cart){
			 System.out.println("Cart:: "+product);
		 }
	}
}
