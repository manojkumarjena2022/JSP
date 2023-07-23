package com.mj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sysdt")
public class SystemServlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//get writer
		PrintWriter pw=res.getWriter();
		//set response type
		res.setContentType("text/html");
		//print response
		pw.println(new Date());
		//close stream
		pw.close();
}
}
