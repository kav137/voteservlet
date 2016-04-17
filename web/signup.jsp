<%--
  Created by IntelliJ IDEA.
  User: kav
  Date: 16.04.2016
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
</head>
<body>
<nav>
    <a href="/index.jsp">Home</a> |
</nav>
<hr>
<h2>Please fill the form:</h2>
<form action="/signup" method="POST">
    <ul>
        <li>Your name: <input type="text" name="name" placeholder="name"></li>
        <li>Login: <input type="text" name="login" placeholder="login"></li>
        <li>Password: <input type="password" name="password" placeholder="password"></li>
        <li><input type="submit" value="Submit"/></li>
    </ul>
</form>
</body>
</html>
