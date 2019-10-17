package com.infoud.ecommerece.shoppingcart;

import java.util.Objects;

public class Product {

	private int productId;
	private String productType;
	private int productQuantity;
	private double productPrice;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productType;
	}

	public void setProductName(String productName) {
		this.productType = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Product(int productId, String productName, int productQuantity,
			double productPrice) {
		super();
		this.productId = productId;
		this.productType = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productType + ", productQuantity=" + productQuantity
				+ ", productPrice=" + productPrice + "]";
	}

}
