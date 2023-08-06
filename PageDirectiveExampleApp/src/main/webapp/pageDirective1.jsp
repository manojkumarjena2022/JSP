<%@page info="This is the page directive test page" %>
<%@page import="java.util.Date" %>
<%@page contentType="text/html" %>
<%= getServletContext().getServerInfo() %><br>
<%= pageContext.getServletConfig().getServletName() %><br>
import: 
<%=new Date()  %><br>

<a href="pageDirective2.jsp">Next</a><br><a href="pageDirective1.jsp">Home</a>