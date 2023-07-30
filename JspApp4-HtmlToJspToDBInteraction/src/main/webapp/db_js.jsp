<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%! Connection con = null;
	PreparedStatement ps1 = null;
	PreparedStatement ps2 = null;
	private static final String INSERT_QUERY = "INSERT INTO JSP_PERSON_INFO values(PID1_SEQ.NEXTVAL,?,?,?,?)";
	private static final String SELECT_QUERY = "SELECT * FROM JSP_PERSON_INFO";

	public void jspInit() {
		//get servlet config object directly
		ServletConfig sc = getServletConfig();
		String driverClass = sc.getInitParameter("driverClass");
		String connectionUrl = sc.getInitParameter("connectionUrl");
		String dbUser = sc.getInitParameter("dbUser");
		String dbUserPassword = sc.getInitParameter("dbUserPassword");
		try {
			//load and register driver
			Class.forName(driverClass);
			//create connection object
			con = DriverManager.getConnection(connectionUrl, dbUser, dbUserPassword);
			//create prepareStatementobject
			ps1 = con.prepareStatement(INSERT_QUERY);
			ps2 = con.prepareStatement(SELECT_QUERY);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>
<%
	//read additional request parameter
	String pval=request.getParameter("p1");
	if(pval.equalsIgnoreCase("register"))
	{
		//read form data
		String name=request.getParameter("pname");
		String age=request.getParameter("page");
		String address=request.getParameter("paddress");
		String email=request.getParameter("pemail");
		ps1.setString(1,name);
		ps1.setString(2,email);
		ps1.setString(3,age);
		ps1.setString(4,address);
		//execute query
		int result=ps1.executeUpdate();
		if(result==0) 
		{%>
<h1 style="color: red; text-align: center;">Record Not Inserted</h1>
<% }
		else
		{ %>
<h1 style="color: green; text-align: center;">Record Inserted</h1>
<% }
	}
	else
	{
		ResultSet rs=ps2.executeQuery(); %>
<table>
	<tr>
		<th>PID</th>
		<th>PNAME</th>
		<th>PAGE</th>
		<th>PEMAIL</th>
		<th>PADDRESS</th>
	</tr>
	<%
		while(rs.next())
		{ %>
	<tr>
		<td><%=rs.getString("pid") %></td>
		<td><%=rs.getString("pname") %></td>
		<td><%=rs.getString("page") %></td>
		<td><%=rs.getString("pemail") %></td>
		<td><%=rs.getString("paddress") %></td>
	</tr>
	<% } %>
</table>
<% }
	%>
<center>
	<a href="person_register_form.html">Home</a>
</center>
<%!
	public void jspDestroy()
	{
		try
		{
			if(ps1!=null)
			{
				ps1.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(ps2!=null)
			{
				ps2.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(con!=null)
			{
				con.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	%>
