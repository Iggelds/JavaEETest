<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07.11.2022
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
  <%@ page import="Cart.Cart" %>

  <% Cart cart = (Cart) session.getAttribute("cart"); %>

  <p>Name: <%= cart.getName()%></p>
  <p>Quantity: <%= cart.getQuantity()%></p>

</body>
</html>
