<!DOCTYPE html>
<html>
<head>
<title>Main1 Page</title>
</head>
<body>
	<!-- Run in chrome browser -->
	<h1 style="color: green; text-align: center;">Main1 JSP Page</h1>
	<%
	java.util.Date date = null;
	int year = date.getYear();
	%>
	<br> Year:<%=year%>
	<br>
	<b>End of main1 JSP</b>
</body>
</html>
