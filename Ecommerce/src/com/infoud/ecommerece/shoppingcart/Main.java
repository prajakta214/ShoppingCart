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

		//  Add Products --------admin
		Laptop laptop1 = new Laptop(01, "Electronic", 2, 35000);
		laptop1.setBrand("HP");

		Laptop laptop2 = new Laptop(02, "Electronic", 2, 30000);
		laptop2.setBrand("Dell");

		MobilePhones mobilePhones = new MobilePhones(03, "Electronic", 2, 15000);
		mobilePhones.setBrand("Samsung");
		mobilePhones.setCameraQuality("32mp");
		mobilePhones.setStorage("16GB");

		MobilePhones mobilePhone = new MobilePhones(04, "Electronic", 3, 25000);
		mobilePhone.setBrand("Oppo");
		mobilePhone.setCameraQuality("40mp");
		mobilePhone.setStorage("16GB");

		MobilePhones mobilePhone1 = new MobilePhones(05, "Electronic", 3, 60000);
		mobilePhone1.setBrand("iPhone 7s");
		mobilePhone1.setCameraQuality("60mp");
		mobilePhone1.setStorage("64GB");

		
		Tv tv1 = new Tv(06, "Electronic", 3, 32000);
		tv1.setBrand("LG");
		tv1.setGeneration("4K gen.");
		
		Tv tv2 = new Tv(07, "Electronic", 3, 30000);
		tv2.setBrand("Lenovo");
		tv2.setGeneration("4K gen.");
		

		Admin admin = new Admin();
		admin.addProduct(laptop1);
		admin.addProduct(laptop2);
		admin.addProduct(mobilePhones);
		admin.addProduct(mobilePhone);
		admin.addProduct(mobilePhone1);
		admin.addProduct(tv1);
		admin.addProduct(tv2);

		admin.viewCart();
		admin.removeProduct(6); //remove product ---admin
		admin.viewCart();
// Customer 1
		Customer customer = new Customer();
		customer.setCustId(11);
		customer.setName("Prajakta");
   // Make Request1 ------customer 1
		RequestOrder requestOrder = new RequestOrder();
		requestOrder.setCustomer(customer);
		requestOrder.setOrderId(124);
		requestOrder.setProduct(mobilePhones);
  // buy product1 --------customer 1
		customer.buyProduct(requestOrder);
		//customer.viewRequestedOrder();

		   // Make Request2 ------ customer 1
	
		RequestOrder requestOrder1 = new RequestOrder();
		requestOrder1.setCustomer(customer);
		requestOrder1.setOrderId(205);
		requestOrder1.setProduct(mobilePhone1);

		// buy product2 --------customer 1

		customer.buyProduct(requestOrder1);
		//customer.viewRequestedOrder();

		//Customer 2
		Customer customer1 = new Customer();
		customer1.setCustId(12);
		customer1.setName("Raveena");
// Make Request -----------customer 2
		RequestOrder requestOrder2 = new RequestOrder();
		requestOrder2.setCustomer(customer1);
		requestOrder2.setOrderId(235);
		requestOrder2.setProduct(laptop1);
		
// buy product 3 ----------------customer 2		
		customer.buyProduct(requestOrder2);
		//customer.viewRequestedOrder();
//make request-------------------customer 2
		RequestOrder requestOrder3 = new RequestOrder();
		requestOrder3.setCustomer(customer1);
		requestOrder3.setOrderId(759);
		requestOrder3.setProduct(laptop2);
		
//Buy Product 4---------------------customer 2
		customer.buyProduct(requestOrder3);
		customer.viewRequestedOrder();

		//Employee
		Employee employee = new Employee();
	//Sell Product 1---------------employee
		employee.sellProduct(124);
	//Sell Product 3---------------employee
			employee.sellProduct(235);
		employee.viewRequestedOrder();
		
		admin.viewCart();
		admin.Report();

	}

}
