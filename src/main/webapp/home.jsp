<%--
  Created by IntelliJ IDEA.
  User: m.ulvi
  Date: 22-Oct-21
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form action="login" id="login-form" method="post">
    <label for="username">Enter your username</label>
    <input type="text" id="username" placeholder="username" name="username">
    <br>
    <hr>
    <label for="password">Enter your password</label>
    <input type="password" id="password" placeholder="password" name="password">
    <br>
    <hr>
    <input type="submit" value="Submit" name="submit">
</form>
</body>
</html>
