package com.infoud.ecommerece.shoppingcart;

public class Laptop extends Product {
	public Laptop(int productId, String productName, int productQuantity,
			double productPrice) {
		super(productId, productName, productQuantity, productPrice);
		// TODO Auto-generated constructor stub
	}

	private String brand;

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", getProductId()=" + getProductId()
				+ ", ProductType=" + getProductName()
				+ ", ProductQuantity=" + getProductQuantity()
				+ ", ProductPrice=" + getProductPrice() + "]";
	}

	

	
	
	

}
