package com.infoud.ecommerece.shoppingcart;

import java.util.List;

public class ProductFunction extends Storage {

	
	public List<Product> addProduct(Product product){
		 cart.add(product);
		return cart;
		 
	 }
	
	public void viewCart(){
		System.out.println("View Cart:: \n  Products inside cart ::");
		 for(Product product:cart){
			 System.out.println("\t"+product);
		 }
	}
	public Product getProductById(int productId) {

		Product product = null;
		List<Product> pList = getCart();
		for (Product product2 : pList) {
			if (product2.getProductId() == productId) {
				product = product2;
				break;
			}
		}

		return product;

	}

	public void removeProductByPID(int productId) {
		Product prod =getProductById(productId);
		
		deleteProduct(prod);
	}
	
	private void deleteProduct(Product product){
		System.out.println("Delete Product from cart:: Product ID: "+ product.getProductId());
		cart.remove(product);
	}
}
