<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- To create data in scope -->
<c:set var="msg" value="Hello" scope="session"/>
<!-- To display data collecting from scope -->
<b>msg value is ::</b><c:out value="${msg}"></c:out><br>
<!-- Remove data from scope -->
<c:remove var="msg"/>
<!-- To display data collecting from scope -->
<b>msg value is ::</b><c:out value="${msg}"></c:out><br>