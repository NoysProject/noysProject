package com.noyproj.javacourse.service;

import java.util.Date;

import com.noyproj.javacourse.Stock;
import com.noyproj.javacourse.model.Portfolio;

public class PortfolioManager {

	public Portfolio getPortfolio(){
		Portfolio portfolio = new Portfolio();
		
		portfolio.setTitle("Noy's portfolio");
		
		Stock s1 = new Stock();
		s1.setSymbol("PIH");
		s1.setAsk((float)13.1);
		s1.setBid((float)12.4);
		s1.setDate(new Date("11/15/2014"));
		
		Stock s2 = new Stock();
		s2.setSymbol("AAL");
		s2.setAsk((float)5.78);
		s2.setBid((float)5.5);
		s2.setDate(new Date("11/15/2014"));
		
		Stock s3 = new Stock();
		s3.setSymbol("CAAS");
		s3.setAsk((float)32.2);
		s3.setBid((float)31.5);
		s3.setDate(new Date("11/15/2014"));
		
		portfolio.addStock(s1);
		portfolio.addStock(s2);
		portfolio.addStock(s3);
		
		return portfolio;
	}	
}
