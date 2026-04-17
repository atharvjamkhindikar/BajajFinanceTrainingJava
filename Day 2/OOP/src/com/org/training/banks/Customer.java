package com.org.training.banks;

public class Customer {

	private int custId;
	private String custName;
	private Address address;
	private String mobile_no;
	private double accBalance;

	public Customer() {
		super();
	}

	public Customer(int custId, String custName, Address address, String mobile_no, double accBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
		this.mobile_no = mobile_no;
		this.accBalance = accBalance;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + ", mobile_no="
				+ mobile_no + ", accBalance=" + accBalance + "]";
	}

	public void Withdraw(double balance) {
		if (accBalance < 0) {
			System.out.println("Insufficient Balance... " + this.getAccBalance());
		} else if (accBalance < balance) {
			System.out.println("Insufficient Balance to withdraw... " + this.getAccBalance());
		} else {
			accBalance = accBalance - this.accBalance;
			System.out.println("Remaininig Balance = " + this.getAccBalance());
		}
	}

	public void Deposit() {
		
		accBalance = this.getAccBalance() + this.accBalance;
		System.out.println("Balance updated Successfully");
		System.out.println("your Account Balance is ... " + this.getAccBalance());

	}

	public void BookFd() {
     
		
	}

}
