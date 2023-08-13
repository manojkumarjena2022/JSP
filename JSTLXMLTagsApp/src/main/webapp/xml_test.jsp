<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x"%>

<c:import var="doc" url="orders.xml" />
<x:parse var="pdoc" xml="${doc}" />

<h3>Displaying all orders</h3>
<x:forEach var="ord" select="$pdoc/orders/order">
    <x:out select="$ord/name" /> - <x:out select="$ord/price" /><br />
</x:forEach>

<h3>Displaying all orders whose price&gt;=20000</h3>
<x:forEach var="ord" select="$pdoc/orders/order">
    <x:if select="$ord/price &gt;= 20000">
        <x:out select="$ord/name" /> - <x:out select="$ord/price" /><br />
    </x:if>
</x:forEach>
