package com.infoud.ecommerece.shoppingcart;

import java.util.List;
import java.util.ArrayList;

import com.infoud.ecommerce.user.Admin;
import com.infoud.ecommerce.user.Customer;
import com.infoud.ecommerce.user.Employee;
import com.infoud.ecommerce.user.User;

public class Main {

	// Admin admin1 =new Admin(1, "admin1", "admin", "admin", "admin");

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop(01, "Electronic", 2, 35000);
		laptop1.setBrand("HP");

		Laptop laptop2 = new Laptop(02, "Electronic", 2, 30000);
		laptop2.setBrand("Dell");

		MobilePhones mobilePhones = new MobilePhones(03, "Electronic", 2, 15000);
		mobilePhones.setBrand("Samsung");
		mobilePhones.setCameraQuality("32mp");
		mobilePhones.setStorage("16GB");

		MobilePhones mobilePhone = new MobilePhones(04, "Electronic", 1, 25000);
		mobilePhone.setBrand("Oppo");
		mobilePhone.setCameraQuality("40mp");
		mobilePhone.setStorage("16GB");

		Tv tv1 = new Tv(05, "Electronic", 1, 32000);
		tv1.setBrand("LG");
		tv1.setGeneration("4K gen.");

		Admin admin = new Admin();
		admin.addProduct(laptop1);
		admin.addProduct(laptop2);
		admin.addProduct(mobilePhones);
		admin.addProduct(mobilePhone);
		admin.addProduct(tv1);
		admin.viewCart();
		admin.removeProduct(4);
		admin.viewCart();

		Customer customer = new Customer();
		customer.setCustId(11);
		customer.setName("Prajakta");
		
		Customer customer1 = new Customer();
		customer1.setCustId(12);
		customer1.setName("Raveena");

		RequestOrder requestOrder = new RequestOrder();
		requestOrder.setCustomer(customer);
		requestOrder.setOrderId(124);
		requestOrder.setProduct(mobilePhone);

		customer.buyProduct(requestOrder);

		RequestOrder requestOrder2 = new RequestOrder();
		requestOrder2.setCustomer(customer1);
		requestOrder2.setOrderId(235);
		requestOrder2.setProduct(tv1);
		customer.buyProduct(requestOrder2);
		customer.viewRequestedOrder();

		Employee employee = new Employee();
		employee.sellProduct(124);
		employee.sellProduct(235);
		employee.viewSells();
		employee.viewRequestedOrder();

	}

}
