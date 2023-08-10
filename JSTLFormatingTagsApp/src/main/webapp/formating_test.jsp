<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="en_US"/> 
<%-- <fmt:setLocale value="hi-IN"/> --%>
<fmt:formatNumber var="salary" value="450000" type="currency"/>
<b>Salary::${salary }</b><br>
<fmt:formatNumber var="range" value="450000.999" type="number" maxIntegerDigits="10" minIntegerDigits="4" maxFractionDigits="3"/>
<b>Range::${range }</b><br>
<fmt:formatNumber var="avg" value="4.5" type="percent"/>
<b>Avg::${avg }</b><br>
<jsp:useBean id="date" class="java.util.Date"/>
<fmt:formatDate value="${date }" var="fdate" dateStyle="full" type="both"/>
<b>Date::${fdate }</b><br>
<fmt:setBundle basename="com/mj/commons/App"/>
<fmt:message var="message" key="welcome.msg"/>
<b>Message::${message }</b><br>
