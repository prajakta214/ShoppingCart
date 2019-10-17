package com.infoud.ecommerece.shoppingcart;

public class MobilePhones extends Product{
	
	private String brand;
	private String storage;
	private String cameraQuality;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getCameraQuality() {
		return cameraQuality;
	}

	public void setCameraQuality(String cameraQuality) {
		this.cameraQuality = cameraQuality;
	}

	public MobilePhones(int productId, String productName, int productQuantity,
			double productPrice) {
		super(productId, productName, productQuantity, productPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MobilePhones [brand=" + brand + ", storage=" + storage
				+ ", cameraQuality=" + cameraQuality + ", ProductId="
				+ getProductId() + ", ProductType=" + getProductName()
				+ ", ProductQuantity=" + getProductQuantity()
				+ ", ProductPrice=" + getProductPrice() + "]";
	}

	

	

}
