<h1> Scripting - Declaration Tag</h1><br>
varibles declared in this tag become global variables of JES class
<br>
<%! int a=10; %>
<% int a=20; %>
local variable a value :<% out.println(a); %><br>
global variable a value :<% out.println(this.a); %><br>
global variable a value :<%= ((scripting_005fdeclaration_005ftag_jsp) page).a %><br>
<b>Method Declaration</b><br>
<%! int sum(int x,int y)
{
    return x+y;
} %>
SUM :<%=sum(5,6)%>
<br><br>
  <a href="index.html">Home</a>
