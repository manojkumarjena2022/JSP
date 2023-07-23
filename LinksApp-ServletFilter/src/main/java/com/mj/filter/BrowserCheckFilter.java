package com.mj.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebFilter("/*")
public class BrowserCheckFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//get writer object
		PrintWriter pw=response.getWriter();
		//set response content type
		response.setContentType("text/html");
		//get request browser details
		String browser=request.getHeader("user-agent");
		System.out.println("Browser Details :"+browser);
		String lc=browser.toLowerCase();
		if(lc.contains("chrome"))
		{
			chain.doFilter(request, response);
		}
		else
		{
			pw.println("<h1 style=\"color: red;text-align: center;\">Request must be given from chrome browser</h1>");
		}
		//close stream
		pw.close();
	}
}
