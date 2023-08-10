<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- set up datasource -->
<sql:setDataSource var="ds" driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:orcl" user="system"
	password="tiger" />
<!-- Send and execute sql query -->
<sql:query var="rs" dataSource="${ds }" sql="SELECT EMPNO,ENAME,DESG,SAL FROM EMPLOYEE"></sql:query>
<h1>The records are</h1>
<table align="center" border="1">
			<tr>
				<th>Emp No</th>
				<th>Emp Name</th>
				<th>Desg</th>
				<th>Salary</th>
			</tr>
			<c:forEach var="emp" items="${rs.rows }" >
				<tr>
					<td>${emp.EMPNO}</td>
					<td>${emp.ename}</td>
					<td>${emp.desg}</td>
					<td>${emp.SAL}</td>
				</tr>
			</c:forEach>
			</table>
