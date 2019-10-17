package com.infoud.ecommerce.user;

import java.util.List;

import com.infoud.ecommerece.shoppingcart.AddProduct;
import com.infoud.ecommerece.shoppingcart.DeleteProduct;
import com.infoud.ecommerece.shoppingcart.Product;
import com.infoud.ecommerece.shoppingcart.ProductFunction;
import com.infoud.ecommerece.shoppingcart.Storage;
import com.infoud.ecommerece.shoppingcart.ViewProduct;

public class Admin extends User {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * public Admin(int id, String name, String role, String userName, String
	 * password) { super(id, name, role); this.userName = userName;
	 * this.password = password; }
	 */
	ProductFunction productFunction=new ProductFunction();


	public List<Product> addProduct(Product product) {

		List<Product> products = productFunction.addProduct(product);
		//System.out.println("product:" + products);
		return products;
	}

	public void viewCart() {
		
		productFunction.viewCart();
	}

	public void removeProduct(int productId) {

		productFunction.removeProductByPID(productId);
	}
}
