package com.infoud.ecommerece.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.infoud.ecommerce.user.User;

public class Storage {
	
	List<Order> orderList =new ArrayList<Order>();
	List<Product> cart=new ArrayList<Product>();
	List<User>userList=new ArrayList<User>();
	List<RequestOrder> requestList=new ArrayList<RequestOrder>();
	List<Order> sellList=new ArrayList<Order>();
			
	
	public List<Order> getSellList() {
		return sellList;
	}
	public void setSellList(List<Order> sellList) {
		this.sellList = sellList;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public List<Product> getCart() {
		return cart;
	}
	public void setCart(List<Product> cart) {
		this.cart = cart;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public List<RequestOrder> getRequestList() {
		return requestList;
	}
	public void setRequestList(List<RequestOrder> requestList) {
		this.requestList = requestList;
	}
	
	
}
