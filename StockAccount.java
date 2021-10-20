package com.stock.account.management;

public class StockAccount {

	private String customer;
	private double balance;

	// Parameterize constructor
	public StockAccount(String customer, double balance) {
		super();
		this.customer = customer;
		this.balance = balance;
	}

	// To Create debit Method
	public double debit(double money) {
		if (money > balance) {
			System.out.println("Debit amount exceeded account balance");
			return 0;
		} else {
			balance = balance - money;
			return money;
		}

	}

	public double checkBalance() {
		return this.balance;
	}

}
