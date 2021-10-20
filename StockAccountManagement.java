package com.stock.account.management;

public class StockAccountManagement {

	public static void main(String[] args) {

		// creating Object
		StockAccount stockAccount = new StockAccount("Salman", 5000);
		System.out.println("You have Succesfully Withdraw: " + stockAccount.debit(3500));
		System.out.println("Your Current Account Balance is: " + stockAccount.checkBalance());
	}
}
