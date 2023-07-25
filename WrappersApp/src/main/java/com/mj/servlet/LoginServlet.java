package com.mj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet doPost()");
		System.out.println("Request class name:"+req.getClass()+", Response class name :"+resp.getClass());
		//get writer
		PrintWriter pw=resp.getWriter();
		//set content type
		resp.setContentType("text/html");
		//get input param values
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		System.out.println("Email :"+email+" , Password :"+password);
		//write business logic
		if (email.equals("manoj@gmail.com") && password.equals("Manoj@1234")) {
			pw.println("<h1 style='color:green;text-align:center'>Valid credentials</h1>");
		}
		else
		{
			pw.println("<h1 style='color:red;text-align:center'>Invalid credentials</h1>");
		}
		//add home link
		pw.println("<a href='login.html'>Home</a>");
		//close stream
		pw.close();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("LoginServlet doGet()");
		doPost(req, resp);
	}
}
