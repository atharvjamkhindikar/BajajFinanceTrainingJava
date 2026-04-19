package com.demo.service;

import java.util.Scanner;

import com.demo.beans.OnlineOrder;
import com.demo.beans.StoreOrder;
import com.demo.dao.OdrerDaoImpl;
import com.demo.dao.OrderDao;
import com.demo.exceptions.InvalidOrderException;

public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao;

	public OrderServiceImpl() {
		orderDao = new OdrerDaoImpl();
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public boolean placeOnlineOrder() {
		System.out.println("Enter OrderID :");
		int orderId = sc.nextInt();

		System.out.println("Enter ProductName :");
		String productName = sc.next();
		
		System.out.println("Enter Amount :");
		double amount = sc.nextDouble();
		
		System.out.println("Enter DeliveryAddress :");
		String deliveryAddress = sc.next();
		
		System.out.println("Enter Status :");
		String status = sc.next();
		
		OnlineOrder order = new OnlineOrder(orderId, productName, amount, deliveryAddress, status);

		return orderDao.saveOnlineOrder(order);
	}

	@Override
	public boolean placeStoreOrder() {
		System.out.println("Enter OrderID :");
		int orderId = sc.nextInt();

		System.out.println("Enter ProductName :");
		String productName = sc.next();
		
		System.out.println("Enter Amount :");
		double amount = sc.nextDouble();
		
		System.out.println("Enter StoreLocation :");
		String StoreLocation = sc.next();
		
		System.out.println("Enter Status :");
		String status = sc.next();
		
		StoreOrder order = new StoreOrder(orderId, productName, amount, StoreLocation, status);
		return orderDao.saveStoreOrder(order);
	}

	@Override
	public boolean cancelOrder(int orderId) throws InvalidOrderException {
		return orderDao.deleteOrder(orderId);
	}
}
