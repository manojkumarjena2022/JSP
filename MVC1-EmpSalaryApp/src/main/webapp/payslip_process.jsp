<%@ page import="com.mj.bean.*,com.mj.service.*" %>
<!-- create or locate java bean class object -->
<jsp:useBean id="emp" class="com.mj.bean.Employee" scope="request"/>
<!-- writ form data to java bean class object -->
<jsp:setProperty property="*" name="emp"/>
<!-- create or locate service class object -->
<jsp:useBean id="service" class="com.mj.service.PaySlipGenerateService" scope="application" />
<!-- invoke business logic -->
<%
 service.generatePaySlip(emp);
%>
<!-- Read the inputs from java bean class obj and display on the browser -->
<h1 style="color: red;text-align: center;">Employee Payslip Report</h1>
<table>
<tr><td>Emp Name :</td><td><%=emp.getName() %></td></tr>
<tr><td>Emp Address :</td><td><%=emp.getAddress() %></td></tr>
<tr><td> Basic Salary :</td><td><%=emp.getBasicSalary() %></td></tr>
<tr><td>Gross Salary :</td><td><%=emp.getGrossSalary() %></td></tr>
<tr><td>Net Salary :</td><td><%=emp.getNetSalary() %></td></tr>
</table>
<br><a href="emp_details.html">Home</a>