<%@page buffer="1kb" autoFlush="true"%>
<b>Manual Flushing to response object from buffer/cache</b>
<br>
<%
for (int i = 0; i < 50; i++) {
	if (i % 20 == 0) {
		out.flush();
		out.println("MJ :" + i + "<br>");
	}
}
%>

<br>
<a href="pageDirective9.jsp">Next</a><br><a href="pageDirective1.jsp">Home</a>