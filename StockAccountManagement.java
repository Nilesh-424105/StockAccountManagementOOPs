package com.stock.account.management;

public class StockAccountManagement {

	public static void main(String[] args) {

		// Creating Object
		StockPortfolio stockPortfolio = new StockPortfolio();
		// Calling Method By Using Object
		stockPortfolio.addStock("DMart", 2, 100);
		stockPortfolio.addStock("Reliance", 3, 150);
		stockPortfolio.calculateStockVal();
		stockPortfolio.printReport();
	}
}
