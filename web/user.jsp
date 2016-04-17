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
<c:choose>
    <c:when test="${voted == true}">
        <h3>You've already voted. Go to <a href="/getResult">result</a></h3>
    </c:when>
    <c:otherwise>
        <h2>Please vote for somebody</h2>
        <form action="/vote" method="post">
            <input type="hidden" name="login" value="${login}">
            <c:forEach items="${RootServlet.vs.getVoting().getCandidates()}" var="cand">
                <input type="radio" name="candidate" value="${cand.getName()}">
                ${cand.getName()}
                </input>
            </c:forEach>
            <input type="submit" value="Vote">
        </form>
    </c:otherwise>
</c:choose>
</body>
</html>
