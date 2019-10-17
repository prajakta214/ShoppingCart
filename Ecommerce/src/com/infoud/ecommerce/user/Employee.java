package com.infoud.ecommerce.user;

import com.infoud.ecommerece.shoppingcart.OrderFunction;
import com.infoud.ecommerece.shoppingcart.Product;
import com.infoud.ecommerece.shoppingcart.RequestOrder;

public class Employee extends User {

	private int empId;
	private String address;
	private double salary;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/*
	 * public Employee(int id, String name, String role, int empId, String
	 * address, double salary) { super(id, name, role); this.empId = empId;
	 * this.address = address; this.salary = salary; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", address=" + address
				+ ", salary=" + salary + "]";
	}

	OrderFunction orderFunction = new OrderFunction();

	public void sellProduct(int orderId) {
		System.out.println("Your order is being saled.");
		orderFunction.removeOrderByID(orderId);
		
		System.out.println("Your order no "+orderId+" is  saled.");

	}

	public void viewRequestedOrder() {
		orderFunction.viewRequestedOrders();
	}
	public void viewSells() {
		orderFunction.viewSellOrder();
	}

		
	}


