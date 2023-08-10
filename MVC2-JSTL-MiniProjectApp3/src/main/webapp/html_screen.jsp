<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<c:choose>
	<c:when test="${!empty empList}">
		<h1 style="color: red; text-align: center;">Employee list
			(${desg})</h1>
		<table align="center" border="1">
			<tr>
				<th>Emp No</th>
				<th>Emp Name</th>
				<th>Desg</th>
				<th>Salary</th>
				<th>Gross Sal</th>
				<th>Net Sal</th>
			</tr>
			<c:forEach var="emp" items="${empList }" >
				<tr>
					<td>${emp.eno}</td>
					<td>${emp.ename}</td>
					<td>${emp.desg}</td>
					<td>${emp.salary}</td>
					<td>${emp.grossSalary}</td>
					<td>${emp.netSalary}</td>
				</tr>
			</c:forEach>
			</c:when>
			<c:otherwise>
				<h1 style="color: red; text-align: center;">Records Not Found</h1>
			</c:otherwise>
			</c:choose>

			<br>
			<br>
			<center>
				<a href="javaScript:showPrint()">Print</a>
			</center>
			<script type="text/javascript">
				function showPrint() {
					frames.focus();
					frames.print();
				}
			</script>