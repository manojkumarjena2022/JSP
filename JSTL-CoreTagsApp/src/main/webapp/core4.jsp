<%@  page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- As traditional for loop -->
<b>Using traditional for loop</b>
<table border="1">
<c:forEach var="i" begin="1" end="10" step="1">
<tr><td><c:out value="${i }"></c:out></td><td><c:out value="${i*2}"></c:out></td></tr>
</c:forEach>
</table>
<hr>
<!-- As enhanced for loop -->
<b>Using enhanced for loop</b>
<%
    List<String> list = new ArrayList<>();
    list.add("java");
    list.add("php");
    list.add(".net");
    list.add("python");
    request.setAttribute("list", list);
%>
<c:forEach var="course" items="${list }">
<h4>${course}</h4><br>
</c:forEach>