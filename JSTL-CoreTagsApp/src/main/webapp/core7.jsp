<%@  page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<b>core7.jsp start</b><br>
<c:url var="file" value="core4.jsp" scope="request" />
<c:import url="${file}" />
<b>core7.jsp end</b>