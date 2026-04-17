package com.org.training.banks;

public class Bank {

	private String name;
	private String location;
	private Address address;
	
	public Bank() {
		super();
	}

	public Bank(String name, String location, Address address) {
		super();
		this.name = name;
		this.location = location;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", location=" + location + ", address=" + address + "]";
	}
	
	
	
	
	
}
