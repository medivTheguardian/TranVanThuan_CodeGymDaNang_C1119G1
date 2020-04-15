<%--
  Created by IntelliJ IDEA.
  User: tranvanthuan
  Date: 4/11/20
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <h2>Product Discount Calculator</h2>
    <form method="post" action="/calculator">
      <label>Product Description</label>
      <input type="text" name="description">
      <br>
      <label>Price</label>
      <input type="text" name="price">
      <br>
      <label>Discount Percent</label>
      <input type="text" name="discount">
      <br>
      <input type="submit" value="Discount Product">
    </form>
  </div>

  </body>
</html>
