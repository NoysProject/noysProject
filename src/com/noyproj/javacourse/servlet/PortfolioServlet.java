package com.noyproj.javacourse.servlet;
import java.io.IOException;

import javax.servlet.http.*;

import com.noyproj.javacourse.model.Portfolio;
import com.noyproj.javacourse.service.PortfolioManager;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
public class PortfolioServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		
		PortfolioManager portfolioManager = new PortfolioManager();
		Portfolio portfolio = portfolioManager.getPortfolio();
		resp.getWriter().println(portfolio.getHtmlString());				
	}	
}
