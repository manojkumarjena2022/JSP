<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pageContext attributes</title>
</head>
<body>
	<b>Start of c.jsp</b>
	Atr1(page scope) value=<%=pageContext.findAttribute("atr1") %><br>
	Atr2(request scope) value=<%=pageContext.findAttribute("atr2") %><br>
	Atr3(session scope) value=<%=pageContext.findAttribute("atr3") %><br>
	Atr4(application scope) value=<%=pageContext.findAttribute("atr4") %><br>
	<b>End of c.jsp</b>
</body>
</html>