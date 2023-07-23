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
public class TimeCheckFilter extends HttpFilter {
@Override
protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	//get writer object
	PrintWriter pw=response.getWriter();
	//set response content type
	response.setContentType("text/html");
	//get system date & time
	LocalDateTime ldt=LocalDateTime.now();
	//get hour
	int hour=ldt.getHour();
	System.out.println("Current hour :"+hour);
	int startDate=10;
	int endDate=17;
	if(hour>=startDate && hour<=endDate)
	{
		chain.doFilter(request, response);
	}
	else
	{
		pw.println("<h1 style=\"color: red;text-align: center;\">Request must be given between "+startDate+" And"+endDate+"</h1>");
	}
	//close stream
	pw.close();
}

}
