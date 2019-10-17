package com.infoud.ecommerece.shoppingcart;

public class Tv extends Product {

	private String brand;
	private String generation;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGeneration() {
		return generation;
	}

	public void setGeneration(String generation) {
		this.generation = generation;
	}

	public Tv(int productId, String productName, int productQuantity,
			double productPrice) {
		super(productId, productName, productQuantity, productPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", generation=" + generation
				+ ", getProductId()=" + getProductId() + ", ProductType="
				+ getProductName() + ", ProductQuantity="
				+ getProductQuantity() + ", ProductPrice=" + getProductPrice()
				+ "]";
	}

}
