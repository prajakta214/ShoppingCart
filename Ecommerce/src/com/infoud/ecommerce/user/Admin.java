package com.infoud.ecommerce.user;

import java.util.List;

import com.infoud.ecommerece.shoppingcart.AddProduct;
import com.infoud.ecommerece.shoppingcart.DeleteProduct;
import com.infoud.ecommerece.shoppingcart.Product;
import com.infoud.ecommerece.shoppingcart.ProductFunction;
import com.infoud.ecommerece.shoppingcart.Report;
import com.infoud.ecommerece.shoppingcart.Storage;
import com.infoud.ecommerece.shoppingcart.ViewPlacedOrder;
import com.infoud.ecommerece.shoppingcart.ViewProduct;
import com.infoud.ecommerece.shoppingcart.placeOrder;

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
	// ProductFunction productFunction=new ProductFunction();
	AddProduct addProduct = new AddProduct();

	public void addProduct(Product product) {

		addProduct.addProduct(product);
	}

	ViewProduct viewProduct = new ViewProduct();

	public void viewCart() {

		viewProduct.viewCartItems();
	}

	DeleteProduct deleteProduct = new DeleteProduct();

	public void removeProduct(int productId) {

		deleteProduct.removeProductByPID(productId);
	}

	Report report = new Report();
	ViewPlacedOrder viewPlacedOrder = new ViewPlacedOrder();

	public void Report() {
		System.out
				.println("\n************************* REPORTS ************************");
		report.viewSaleReport();
		System.out.println("Cart Element Report::");
		viewProduct.viewCartItems();
		System.out.println("Requested Order Report::");
		viewPlacedOrder.viewPlacedOrder();
	}
}
