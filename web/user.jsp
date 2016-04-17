<%@ page import="com.kav.vote.Candidate" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.kav.vote.RootServlet" %><%--
  Created by IntelliJ IDEA.
  User: kav
  Date: 16.04.2016
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<nav>
    <a href="/index.jsp">Home</a> |
</nav>
<h1>Hello, ${name}</h1>
<h2>Please vote for somebody</h2>

<%--<select name="candidate" id="candidate">--%>
<%--<c:forEach items="${RootServlet.vs.getVoting().getCandidates()}" var="cand">--%>
<%--<option value="${cand.getName()}">--%>
<%--${cand.getName()}--%>
<%--</option>--%>
<%--</c:forEach>--%>
<%--</select>--%>

<form action="/vote" method="post">
    <c:forEach items="${RootServlet.vs.getVoting().getCandidates()}" var="cand">
        <input type="radio" name="candidate" value="${cand.getName()}">
        ${cand.getName()}
        </input>
    </c:forEach>
    <input type="submit" value="Vote">
</form>


</body>
</html>
