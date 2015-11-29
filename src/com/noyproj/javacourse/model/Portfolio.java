package com.noyproj.javacourse.model;
import com.noyproj.javacourse.Stock;

public class Portfolio {
	
	private static final int MAX_PORTFOLIO_SIZE = 5;
	private String title;
	private Stock[] stocks;
	private int portfolioSize;
	
	public Portfolio() {
		this.stocks = new Stock[MAX_PORTFOLIO_SIZE];
	}
	
	public void addStock(Stock stocks) {
		if (portfolioSize < MAX_PORTFOLIO_SIZE)
		{
			this.stocks[portfolioSize++] = stocks;
		}
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Stock[] getStocks() {
		return stocks;
	}
	
	public String getHtmlString() {
		String result = "<h1>" + this.title + "</h1><p>";
		
		for(int i = 0; i < portfolioSize; i++)
		{
			result += stocks[i].getHtmlDescription() + "<br>";
		}
		
		return result;
	}	
}
