package com.demo.beans;

import com.demo.exceptions.InvalidOrderException;

public interface Order {

	void placeOrder();

	void cancelOrder(int orderId) throws InvalidOrderException;
}
