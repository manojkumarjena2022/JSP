<%@ page import="java.util.*,com.mj.model.*" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- read request scope data -->
	<%
	List<Employee> list = (List<Employee>) request.getAttribute("empList");
	String desg = request.getParameter("desg");
	//set response content type
	response.setContentType("application/ms-excel");
	//specify the content disposition
	response.addHeader("Content-Disposition", "attachment;fileName=emps.xls");
	%>
	<h1 style="color: red; text-align: center;">
		Employee list (<%=desg%>)
	</h1>
	<%
	if (list != null && list.size() != 0) {
	%>

	<table align="center" border="1">
		<tr>
			<th>Sl No</th>
			<th>Emp No</th>
			<th>Emp Name</th>
			<th>Desg</th>
			<th>Salary</th>
			<th>Gross Sal</th>
			<th>Net Sal</th>
		</tr>
		<%
		int i = 0;
		for (Employee emp : list) {
		%>
		<tr>
			<td><%=++i%></td>
			<td><%=emp.getEno()%></td>
			<td><%=emp.getEname()%></td>
			<td><%=emp.getDesg()%></td>
			<td><%=emp.getSalary()%></td>
			<td><%=emp.getGrossSalary()%></td>
			<td><%=emp.getNetSalary()%></td>
		</tr>
		<%
		}
		%>
	</table>
	<%
	} else {
	%>
	<h1 style="color: red; text-align: center;">Records Not Found</h1>
	<%
	}
	%>
	<br><br>
	<center><a href="javaScript:showPrint()">Print</a></center>
	<script type="text/javascript">
	function showPrint() {
		frames.focus();
		frames.print();
	}
	</script>
</body>
</html>