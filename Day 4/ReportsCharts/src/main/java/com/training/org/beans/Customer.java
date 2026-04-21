package com.training.org.beans;

public class Customer {
	private int CustId;
	private String CustName;
	private String Address;
	private String Mobile;
	private BillBook billRecord;

	public Customer() {

	}

	public BillBook getBillRecord() {
		return billRecord;
	}

	public void setBillRecord(BillBook billRecord) {
		this.billRecord = billRecord;
	}

	public Customer(int custId, String custName, String address, String mobile, BillBook billRecord) {
		super();
		CustId = custId;
		CustName = custName;
		Address = address;
		Mobile = mobile;
		this.billRecord = billRecord;
	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", CustName=" + CustName + ", Address=" + Address + ", Mobile=" + Mobile
				+ "]";
	}

}
