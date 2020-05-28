<%--
  Created by IntelliJ IDEA.
  User: dat
  Date: 28/05/2020
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tu Dien </title>
</head>
<body>
<form action="/converts" method="post">
    <label>NAME: </label>
    <input type="text" name="name">
    <br>
    <br>
    <br>
    Result:<h1>${values}</h1>
    <input type="submit" value="submit">
</form>
</body>
</html>
