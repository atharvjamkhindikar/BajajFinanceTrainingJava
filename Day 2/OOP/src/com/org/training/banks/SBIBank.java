package com.org.training.banks;

import java.util.ArrayList;

public class SBIBank extends Bank {

	private double savingBankInterestRate;
	private double FDRatesonLocation; // FD rates based on the location
	private double currentAccountInterestRate;
	private ArrayList<Customer> clist;

	public SBIBank() {
		super();
	}

	public SBIBank(double savingBankInterestRate, double fDRatesonLocation, double currentAccountInterestRate,
			ArrayList<Customer> clist) {
		super();
		this.savingBankInterestRate = savingBankInterestRate;
		FDRatesonLocation = fDRatesonLocation;
		this.currentAccountInterestRate = currentAccountInterestRate;
		this.clist = clist;
	}

	public double getSavingBankInterestRate() {
		return savingBankInterestRate;
	}

	public void setSavingBankInterestRate(double savingBankInterestRate) {
		this.savingBankInterestRate = savingBankInterestRate;
	}

	public double getFDRatesonLocation() {
		return FDRatesonLocation;
	}

	public void setFDRatesonLocation(double fDRatesonLocation) {
		FDRatesonLocation = fDRatesonLocation;
	}

	public double getCurrentAccountInterestRate() {
		return currentAccountInterestRate;
	}

	public void setCurrentAccountInterestRate(double currentAccountInterestRate) {
		this.currentAccountInterestRate = currentAccountInterestRate;
	}

	public ArrayList<Customer> getClist() {
		return clist;
	}

	public void setClist(ArrayList<Customer> clist) {
		this.clist = clist;
	}

	@Override
	public String toString() {
		return "SBIBank [ getName()=" + getName() + "savingBankInterestRate=" + savingBankInterestRate
				+ ", FDRatesonLocation=" + FDRatesonLocation + ", currentAccountInterestRate="
				+ currentAccountInterestRate + ", clist=" + clist + " Location=" + getLocation() + ", Address()="
				+ getAddress() + "]";
	}

	public void calculateRateInterestOfFD() {

	}

}
