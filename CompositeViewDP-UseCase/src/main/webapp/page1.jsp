<!DOCTYPE html>
<html>
<head>
<title>Page1</title>
<style>
/* style.css */

/* General styles for the sidebar */
.sidebar {
	height: 100%;
/* 	width: 250px; */
	background-color: #333;
	position: fixed;
	top: 0;
	left: 0;
	padding-top: 20px;
}

/* Styles for each menu item link */
.menu-item {
	display: block;
	color: white;
	padding: 12px 16px;
	text-decoration: none;
	transition: background-color 0.3s;
}

/* Hover effect for menu items */
.menu-item:hover {
	background-color: #555;
}

/* Active menu item style */
.menu-item.active {
	background-color: #777;
}
</style>
</head>
<body>
	<table width="100%" height="100%">
		<tr>
			<td><jsp:include page="headerurl" /></td>
		</tr>
		<tr>
		<td width="15%"><%@include file="menu.html" %></td>
		<td width="70%"><%@include file="international.jsp" %></td>
		<td width="15%" height="100%" style="border-left: 1px solid #ccc;padding-right: 10px;"><%@include file="weather.jsp" %></td>
		</tr>
		<tr><td><%@include file="footer.html" %></td></tr>
	</table>
</body>
</html>
