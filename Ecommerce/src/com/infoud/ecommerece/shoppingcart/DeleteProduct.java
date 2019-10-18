package com.infoud.ecommerece.shoppingcart;

public class DeleteProduct extends ProductByID {

	public void removeProductByPID(int productId) {
		System.out.println();
		System.out.println("Product to delete:: " +productId);
		Product prod = getProductById(productId);
		System.out.println();
		
		deleteProduct(prod);
	}
	public void deleteProduct(Product product){
		Storage.cart.remove(product.getProductId());
		System.out.println();
	}
}
