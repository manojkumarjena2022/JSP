package com.mj.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebFilter("/*")
public class PerformanceTestFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long startTime=0L;long endTime=0L;
		startTime=System.currentTimeMillis();
		chain.doFilter(request, response);
		endTime=System.currentTimeMillis();
		System.out.println(request.getRequestURL()+" has taken "+(endTime-startTime)+" ms to process the request");
	}
}
