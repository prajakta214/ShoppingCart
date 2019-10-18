package com.infoud.ecommerece.shoppingcart;

import java.util.HashMap;
import java.util.Map;

import com.infoud.ecommerce.user.User;

public class Storage {
	
	public static Map<Integer ,Product> cart=new HashMap<Integer,Product>();
	public static Map<Integer, User>userList=new HashMap<Integer,User>();
	public static Map<Integer, Product> sellList=new HashMap<Integer,Product>();
	public static Map<Integer,Order> orderList =new HashMap<Integer,Order>();
	
	
	public static Map<Integer, Product> getCart() {
		return cart;
	}
	public static void setCart(Map<Integer, Product> cart) {
		Storage.cart = cart;
	}
	public static Map<Integer, User> getUserList() {
		return userList;
	}
	public static void setUserList(Map<Integer, User> userList) {
		Storage.userList = userList;
	}
	public static Map<Integer, Product> getSellList() {
		return sellList;
	}
	public static void setSellList(Map<Integer, Product> sellList) {
		Storage.sellList = sellList;
	}
	public static Map<Integer, Order> getOrderList() {
		return orderList;
	}
	public static void setOrderList(Map<Integer, Order> orderList) {
		Storage.orderList = orderList;
	}
	
	
	
	
}
