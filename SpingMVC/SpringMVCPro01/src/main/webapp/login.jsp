<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/2
  Time: 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  action="log.do" method="post">
    用户名:<input type="text" name="username" /><br>
    密码  :<input type="password" name="pwd" /><br>
    <input type="submit" value="登陆"/>
    <span>${info}</span>
</form>
</body>
</html>
