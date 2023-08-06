<%@ page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>Main Page</title>
</head>
<body>
	<!-- Run in chrome browser -->
	<h1 style="color: green; text-align: center;">Main JSP Page</h1>
	<% int a = Integer.parseInt("10a"); %>
	<br> value:<%=a%>
	<br>
	<b>End of main JSP</b>
</body>
</html>
