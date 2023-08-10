<%@  page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="msg" value="how are you?" scope="request" />
<c:forTokens var="token" items="${msg }" delims=" ">
${token }<br>
</c:forTokens>