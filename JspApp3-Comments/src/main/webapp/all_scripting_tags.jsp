<%!public String generateWishMessage(String name) {
		//get system date and time
		java.time.LocalDateTime ldt = java.time.LocalDateTime.now();
		//get hour
		int hour = ldt.getHour();
		//generate wish message
		if (hour < 12)
			return "Good morning " + name;
		else if(hour<16)
			return "Good afternoon " + name;
		/* else if(hour<20)
			return "Good evening " + name; */
		else 
			return "Good night " + name;
	}%>
<!-- 	<h1 style="color:red;text-align: center;">Welcome to Java Server Page</h1> -->
	<h3 style="color: green;">Date & Time is ::<!-- <%=new java.util.Date() %> --></h3>
	<% String name="Manoj"; %>
	<%--<br>--%>
	<br>Wish Message is:: <%-- <%=generateWishMessage(name) %> --%>
	