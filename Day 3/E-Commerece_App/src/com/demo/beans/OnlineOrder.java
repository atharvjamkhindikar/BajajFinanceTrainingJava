package com.demo.beans;

import com.demo.exceptions.InvalidOrderException;

public class OnlineOrder implements Order {

	private int orderId;
	private String productName;
	private double amount;
	private String deliveryAddress;
	private String status;

	public OnlineOrder() {
		super();
	}

	public OnlineOrder(int orderId, String productName, double amount, String deliveryAddress, String status) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.amount = amount;
		this.deliveryAddress = deliveryAddress;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OnlineOrder [orderId=" + orderId + ", productName=" + productName + ", amount=" + amount
				+ ", deliveryAddress=" + deliveryAddress + ", status=" + status + "]";
	}

	@Override
	public void placeOrder() {
		System.out.println("Placing online order: " + this);

	}

	@Override
	public void cancelOrder(int orderId) throws InvalidOrderException {
		if (this.orderId == orderId) {
			this.status = "Cancelled";
			System.out.println("Order cancelled successfully: " + this);
		} else {
			throw new InvalidOrderException("Invalid order ID: " + orderId);
		}

	}

}
