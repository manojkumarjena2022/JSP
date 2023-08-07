package com.mj.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/headerurl")
public class HeaderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set the content type to HTML
		response.setContentType("text/html");

		// Get the PrintWriter to write the HTML content
		PrintWriter out = response.getWriter();

		// Write the header HTML
		 out.println("<header style=\"position: fixed; top: 0; left: 0; width: 100%; background-color: #333; color: white;\">");
	        out.println("    <marquee>Welcome to Our News Channel!</marquee>");
	        out.println("</header>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
