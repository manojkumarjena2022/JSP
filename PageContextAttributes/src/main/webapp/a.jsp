<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pageContext Attributes</title>
</head>
<body>
	<b>Start of a.jsp</b>
	<br>
	<%
	pageContext.setAttribute("atr1", "val1");//default PAGE_SCOPE
	pageContext.setAttribute("atr2", "val2", pageContext.REQUEST_SCOPE);
	pageContext.setAttribute("atr3", "val3", pageContext.SESSION_SCOPE);
	pageContext.setAttribute("atr4", "val4", pageContext.APPLICATION_SCOPE);
	%>
	<jsp:forward page="b.jsp"/>
	<b>End of a.jsp</b>
</body>
</html>