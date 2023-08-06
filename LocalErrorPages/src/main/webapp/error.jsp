<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h1 style="color: red; text-align: center;">Internal Error</h1>
    <hr>
    <% if (exception != null) { %>
        Problem is::<%=exception.toString() %>
    <% } else { %>
        Problem is unknown.
    <% } %>
</body>
</html>
