<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- set up datasource -->
<sql:setDataSource var="ds" driver="oracle.jdbc.OracleDriver"
	url="jdbc:oracle:thin:@localhost:1521:orcl" user="system"
	password="tiger" />
<!-- Send and execute sql query -->
<sql:update sql="UPDATE EMPLOYEE SET SAL=SAL+? WHERE DESG=?" var="count" dataSource="${ds }">
<sql:param value="500"/>
<sql:param value="CLERK"/>
</sql:update> 
<b>${count } no of records are updated</b>


