<%--
  Created by IntelliJ IDEA.
  User: tranvanthuan
  Date: 4/27/20
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SandWich</title>
</head>
<body>
<h1>Sandwich Condiments:</h1>
<form action="/save" method="post">
    <input type="checkbox" name="condiment" value="Lettuce">Lettuce<br>
    <input type="checkbox" name="condiment" value="Tomato">Tomato<br>
    <input type="checkbox" name="condiment" value="Mustard">Mustard<br>
    <input type="checkbox" name="condiment" value="Sprouts">Sprouts<br>
    <input type="submit" value="Save">
</form>


</body>
</html>
