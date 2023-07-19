<h1> Scripting - Scriplet Tag</h1><br>
varibles declared in this tag become local variables to _jspService() method of JES class
<br>
<% int a=9;
   int b=8;
   int c=a+b;
   out.println("Result :: "+c);
 %><br>
 <b>Implicit Objects</b><br>
 <%
   String browserName=request.getHeader("user-agent");
   out.println("Browser Name :"+browserName);
  %>
<br><b>Using XML Syntax</b><br>
  <jsp:scriptlet>
     int d=10;
    out.println("Square value ::"+(d*d));
  </jsp:scriptlet>
  <br><b>Symbol Problem XML Syntax</b><br>
  <%-- 
  <jsp:scriptlet>
     boolean res=a<b ;
    out.println("Comparision value ::"+res);
  </jsp:scriptlet>
  scripting_scriplet_tag.jsp (line: [20], column: [17]) Unterminated [&lt;jsp:scriptlet&gt;] tag 
  --%>
  <jsp:scriptlet>
     <![CDATA[
     boolean res=a<b;
     out.println("Square value ::"+res);
     ]]>
    
  </jsp:scriptlet>
<br><br>
  <a href="index.html">Home</a>
