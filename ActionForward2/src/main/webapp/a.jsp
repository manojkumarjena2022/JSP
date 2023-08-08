<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action forward</title>
</head>
<body>
<b>Start of a.jsp</b><br>
<% int age=26; %>
<jsp:forward page="b.jsp">
<jsp:param value="Manoj" name="uname"/>
<jsp:param value="<%=age%>" name="age"/>
</jsp:forward>
<b>End of a.jsp</b>
</body>
</html>