package com.training.org.beans;

import java.time.LocalDate;

public class BillBook {

	private int billId;
	private LocalDate billDate;
	private String Product_Name;
	private int Quantity;
	private double totalAmount;

	public BillBook() {
		super();
	}

	public BillBook(int billId, LocalDate billDate, String product_Name, int quantity, double totalAmount) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		Product_Name = product_Name;
		Quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "BillBook [billId=" + billId + ", billDate=" + billDate + ", Product_Name=" + Product_Name
				+ ", Quantity=" + Quantity + ", totalAmount=" + totalAmount + "]";
	}
	
	

}
