package com.infoud.ecommerece.shoppingcart;

public class DeleteProduct extends ProductByID {

	public void removeProductByPID(int productId) {
		Product prod = getProductById(productId);
		
		deleteProduct(prod);
	}
	
	public void deleteProduct(Product product){
		cart.remove(product);
	}
}
