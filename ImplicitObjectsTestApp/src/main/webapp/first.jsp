<h1 style="color:red;text-align: center;">JSP Implicit Objects</h1>
out object class name :<%=out.getClass() %><br>
config object class name :<%=config.getClass() %><br>
application object class name :<%=application.getClass() %><br>
page object class name :<%=page.getClass() %><br>
page context object class name :<%=pageContext.getClass() %><br>
request object class name :<%=request.getClass() %><br>
response object class name :<%=response.getClass() %><br>
session object class name :<%=session.getClass() %><br>
<%! public void jspInit()
{
	try{
	Class.forName("oracle.jdbc.OracleDriver");
	System.out.println("driver loaded");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	//System.out.println("application object class name :"+application);//invalid
	//System.out.println("config object class name :"+config);//invalid
	ServletConfig sc=getServletConfig();
	ServletContext scon=getServletContext();
	System.out.println("application object class name :"+sc+" Hash code :"+sc.hashCode());//invalid
	System.out.println("config object class name :"+scon+" Hsn code :"+scon.hashCode());//invalid
	
}
%>