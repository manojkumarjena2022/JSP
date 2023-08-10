<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:set value="Welcome to JSTL" var="message" scope="request"></c:set>
current message::${message}<br>
uppercase message::${fn:toUpperCase(message)}<br>
lowercase message::${fn:toLowerCase(message)}<br>
substring message::${fn:substring(message,0,7)}<br>
substring after message::${fn:substringAfter(message,"to")}<br>
