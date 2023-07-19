<h1> Scripting - Expression Tag</h1><br>
<% 
int a =10;
int b=20;
String s="Hello";
%>
a value :<%=a%><br>
b value :<%=b%><br>
a+b value :<%=a+b%><br>
a < b value :<%=a<b%><br>
<b> Implicit Object</b><br>
Browser name :<%=request.getHeader("user-agent")%>
<b> Method Call (Whose return type is not void)</b><br>
String legth :<%=s.length()%><br>
<b> Instatiation</b><br>
Date & Time :<%=new java.util.Date()%>
<b> XML Syntax</b><br>
value of a :<jsp:expression>a</jsp:expression>
<br><br>
  <a href="index.html">Home</a>
