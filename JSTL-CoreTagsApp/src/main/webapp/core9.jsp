<%@  page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:catch var="e">
	<jsp:scriptlet>java.util.Date date = null;
date.getYear();</jsp:scriptlet>>
</c:catch>
<h1>The raised exception is::${e }</h1>