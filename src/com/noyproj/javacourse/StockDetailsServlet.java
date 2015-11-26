package com.noyproj.javacourse;
import java.io.IOException;

import javax.servlet.http.*;

import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
public class StockDetailsServlet extends HttpServlet {

	@SuppressWarnings("deprecation")
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
				
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
			
		String sd1 = s1.getHtmlDescription();
		String sd2 = s2.getHtmlDescription();
		String sd3 = s3.getHtmlDescription();
		
		String resultStr = sd1 + "<br>" + sd2 + "<br>" +sd3;
		
		resp.getWriter().println(resultStr);		
	}	
}
