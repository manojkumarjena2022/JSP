<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
	<c:when test="${param.p lt 0 }">
		<h1 style="color: red; text-align: center;">
			<c:out value="${param.p }" />
			is negative
		</h1>
	</c:when>
	<c:when test="${param.p gt 0 }">
		<h1 style="color: green; text-align: center;">
			<c:out value="${param.p }" />
			is positive
		</h1>
	</c:when>
	<c:otherwise>
	<h1 style="color: red; text-align: center;">
			<c:out value="${param.p }" />
			is Zero
		</h1>
	</c:otherwise>
</c:choose>