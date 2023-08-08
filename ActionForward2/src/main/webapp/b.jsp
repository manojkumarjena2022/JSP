<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action forward</title>
</head>
<body>
	<b>Start of b.jsp</b>
	<br>
	<%=new java.util.Date()%><br>
	<b>Request param values :</b><br>
	<%
	String uname = request.getParameter("uname");
	int age = Integer.parseInt(request.getParameter("age"));
	%>
	Name=<%=uname %>,
	Age=<%=age %><br>
	<b>End of b.jsp</b>
</body>
</html>