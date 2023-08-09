<%@ page isELIgnored="false"%>
<%
pageContext.setAttribute("atr1", "val1");
pageContext.setAttribute("atr2", "val2",PageContext.REQUEST_SCOPE);
pageContext.setAttribute("atr3", "val3",PageContext.SESSION_SCOPE);
pageContext.setAttribute("atr4", "val4",PageContext.APPLICATION_SCOPE);
%>
<jsp:forward page="test2.jsp"/>

