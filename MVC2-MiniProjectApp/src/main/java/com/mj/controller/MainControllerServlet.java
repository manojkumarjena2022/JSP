package com.mj.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mj.model.Employee;
import com.mj.service.EmployeeMgmtServiceImpl;
import com.mj.service.IEmployeeMgmtService;

/**
 * Servlet implementation class MainControllerServlet
 */
@WebServlet(urlPatterns = "/empControllerUrl",loadOnStartup = 1)
public class MainControllerServlet extends HttpServlet {
	IEmployeeMgmtService employeeMgmtService;
	@Override
		public void init() throws ServletException {
			employeeMgmtService=new EmployeeMgmtServiceImpl();
		}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//read form data
		String desg=request.getParameter("desg");
		String action=request.getParameter("s1");
		//invoke business logic
		try {
			List<Employee> list=employeeMgmtService.fetchEmpsByDesg(desg);
			//keep the result in request scope to send to the view comps
			request.setAttribute("empList", list);
			//forward the request to result page based on the button clicked
			String resultPage=null;
			if (action.equalsIgnoreCase("HTML Output")) {
				resultPage="/html_screen.jsp";
			}
			else
			{
				resultPage="/excel_screen.jsp";
			}
			//System.out.println(resultPage);
			RequestDispatcher rd=request.getRequestDispatcher(resultPage);
			rd.forward(request, response);
		} catch (SQLException se) {
			se.printStackTrace();
			RequestDispatcher rd=request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			RequestDispatcher rd=request.getRequestDispatcher("/error.jsp");
			rd.forward(request, response);
		}
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
