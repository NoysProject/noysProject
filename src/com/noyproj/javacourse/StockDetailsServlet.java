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
		
		Stock s1 = new Stock("PIH", (float)13.1,(float)12.4, new Date("11/15/2014"));
		
		Stock s2 = new Stock("AAL", (float)5.78,(float)5.5, new Date("11/15/2014"));
		
		Stock s3 = new Stock("CAAS", (float)32.2,(float)31.5, new Date("11/15/2014"));
					
		String sd1 = s1.getHtmlDescription();
		String sd2 = s2.getHtmlDescription();
		String sd3 = s3.getHtmlDescription();
		
		String resultStr = sd1 + "<br>" + sd2 + "<br>" +sd3;
		
		resp.getWriter().println(resultStr);		
	}	
}
