<%--
  Created by IntelliJ IDEA.
  User: kav
  Date: 16.04.2016
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body>
<nav>
    <a href="/index.jsp">Home</a> |
</nav>
<form action="/signin" method="POST">
    <ul>
        <li>Login: <input type="text" name="login" placeholder="login"></li>
        <li>Password: <input type="password" name="password" placeholder="password"></li>
        <li><input type="submit" value="Submit"/></li>
    </ul>
</form>
</body>
</html>
