<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07.11.2022
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            java.util.Date now = new java.util.Date();
            String someString = "Текущая дата: " + now;
        %>

        <%= someString %>

        <%
            for (int i=0; i < 10; i++) {
                out.println("<p>" + "Hello: " + i + "</p>");
            }
        %>

        <%
            String name = request.getParameter("name");
        %>

        <%= "Hello " + name%>
    <p>
</body>
</html>
