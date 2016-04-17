<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kav
  Date: 16.04.2016
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>

<nav>
    <a href="/index.jsp">Home</a> |
</nav>
<h1>admin</h1>
<c:if test="${!successMessage.isEmpty()}">
    <h3 style="color: #0F0;">${successMessage}</h3>
</c:if>
<form action="/createVoting" method="POST">
    <ul>
        <li>Title : <input type="text" name="voteTitle"></li>
        <input type="submit" value="Create">
    </ul>
</form>
<hr>
<form action="/addCandidate" method="post">
    <ul>
        <li>Candidate name : <input type="text" name="candidateName"></li>
        <input type="submit" value="Add">
    </ul>
</form>
<hr>
<ul>
    <li>
        <form action="/getResult"><input type="submit" value="Get results"></form>
    </li>
</ul>
</body>
</html>
