<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- To create data in scope -->
<c:set var="msg" value="Hello" scope="session" />
<c:if test="${param.uname ne null}">
	<h1 style="color: red; text-align: center;">
		<c:out value="${msg }" />
		<c:out value="${uname}" />
	</h1>
</c:if>
<h1 style="color: blue; text-align: center;">Hii to every one</h1>