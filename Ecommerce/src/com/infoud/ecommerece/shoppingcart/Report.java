package com.infoud.ecommerece.shoppingcart;

import java.util.Map;

public class Report {

	public void viewSaleReport() {
		System.out.println("Sale Report::");
		for (Map.Entry<Integer, Product> entry : Storage.sellList.entrySet()) {
			System.out.println("Order Id:: " + entry.getKey()
					+ " Order  Details :: " + entry.getValue());
		}
	}
}
