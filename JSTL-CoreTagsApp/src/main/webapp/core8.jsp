<%@  page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<b>core8.jsp start</b><br>
<c:url var="googleUrl" value="https://www.google.com?q=java" scope="request" />
<c:redirect url="${googleUrl }" />
<b>core8.jsp end</b>