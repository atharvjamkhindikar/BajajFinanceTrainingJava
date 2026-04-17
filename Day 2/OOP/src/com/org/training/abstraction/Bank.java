package com.org.training.abstraction;

abstract class BankAccount {
	protected double balance;

	public BankAccount() {
		System.out.println("Default Constructor of BankAccount is called ");
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount is Deposited");
	}

	public abstract void withdraw(double amount);

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

}

class SavingsAccount extends BankAccount {

	@Override
	public void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Balance is low");
		} else {
			balance -= amount;
			System.out.println("Amount withdraw from SavingsAccount");
		}

	}

}

class CurrentAccount extends BankAccount {

	private double overDraftAmount = 500;

	@Override
	public void withdraw(double amount) {
		if (balance + overDraftAmount < amount) {
			System.out.println("Balance is low");
		} else {
			balance -= amount;
			System.out.println("Amount withdraw from currentAccount");
		}

	}

}

public class Bank {
	public static void main(String[] args) {

	}

}