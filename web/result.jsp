<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kav
  Date: 17.04.2016
  Time: 02:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<nav>
    <a href="/index.jsp">Home</a> |
</nav>
<ul>
    <c:forEach items="${result}" var="item">
        <li> ${item} </li>
    </c:forEach>
</ul>

</body>
</html>
