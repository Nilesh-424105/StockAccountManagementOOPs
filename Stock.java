package com.stock.account.management;

public class Stock {

	private String stockName;
	private int numOfShares;
	private int sharePrice;

	// Constructor
	public Stock(String stockName, int numOfShares, int sharePrice) {
		super();
		this.stockName = stockName;
		this.numOfShares = numOfShares;
		this.sharePrice = sharePrice;
	}

	// Getters and Setters
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

}
