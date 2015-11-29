package com.noyproj.javacourse.service;

import java.util.Date;

import com.noyproj.javacourse.Stock;
import com.noyproj.javacourse.model.Portfolio;

public class PortfolioManager {

	public Portfolio getPortfolio(){
		Portfolio portfolio = new Portfolio();
		
		portfolio.setTitle("Noy's portfolio");
		
		Stock s1 = new Stock("PIH", (float)13.1, (float)12.4, new Date("11/15/2014"));
		
		Stock s2 = new Stock("AAL", (float)5.78, (float)5.5, new Date("11/15/2014"));
		
		Stock s3 = new Stock("CAAS", (float)32.2, (float)31.5, new Date("11/15/2014"));
		
		portfolio.addStock(s1);
		portfolio.addStock(s2);
		portfolio.addStock(s3);
		
		return portfolio;
	}	
}
