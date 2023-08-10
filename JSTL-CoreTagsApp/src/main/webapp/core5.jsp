<%@  page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>request param name and values</h1>
<br>
<c:forEach var="p" items="${paramValues }">
	<b>request param name::${p.key}</b>
	<c:forEach var="pv" items="${p.value }">
${pv },
</c:forEach>
	<br>
</c:forEach>

<h1>request param name and values</h1>
<br>
<c:forEach var="h" items="${headerValues }">
	<b>request param name::${h.key}</b>
	<c:forEach var="hv" items="${h.value }">
${hv },
</c:forEach>
	<br>
</c:forEach>