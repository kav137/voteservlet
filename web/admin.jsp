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
<form action="/createVoting" method="POST">
    <ul>
        <li>Title : <input type="text" name="voteTitle"></li>
        <input type="submit" value="Create">
    </ul>
</form>
<hr>
<form action="/addCandidate" method="post">
    <li>Candidate name : <input type="text" name="candidateName"></li>
    <input type="submit" value="Add">
</form>
<hr>
<form action="/getResult"><input type="submit" value="Get results"></form>
</body>
</html>
