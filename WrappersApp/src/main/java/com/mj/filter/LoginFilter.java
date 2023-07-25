package com.mj.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mj.wrapper.CustomRequest;
import com.mj.wrapper.CustomResponse;
@WebFilter("/loginurl")
public class LoginFilter extends HttpFilter {
@Override
protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
		throws IOException, ServletException {
	//create CustomRequest object
	CustomRequest creq=new CustomRequest(request);
	//create CustomResponse object
	CustomResponse cresp=new CustomResponse(response);
	//call next filter or destination comp
	chain.doFilter(creq, cresp);
	//collect content from custom response
	String output=cresp.toString();
	//modify the content
	output+="<br><b>Manoj Kumar Jena</b>";
	//get print writer object pointing to container created response object
	PrintWriter pw=response.getWriter();
	pw.println(output);
	//close stream
	pw.close();
}
}
