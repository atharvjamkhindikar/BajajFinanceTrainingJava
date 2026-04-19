package com.demo.service;

import com.demo.exceptions.InvalidOrderException;

public interface OrderService {

	boolean placeOnlineOrder();

	boolean placeStoreOrder();

	 boolean cancelOrder(int orderId) throws InvalidOrderException;

}
