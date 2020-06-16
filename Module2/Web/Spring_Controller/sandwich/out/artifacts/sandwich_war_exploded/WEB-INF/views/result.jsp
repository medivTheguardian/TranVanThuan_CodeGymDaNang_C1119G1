<%--
  Created by IntelliJ IDEA.
  User: tranvanthuan
  Date: 4/27/20
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${message}</h2>
<c:forEach var="condiment" items="${condiments}">
    <c:out value="${condiment}"></c:out>
</c:forEach>
</body>
</html>
