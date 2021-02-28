<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/2
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="ucon.do" method="post">
    用户名: <input type="text" name="username" /><br>
    密码:   <input type="password" name="pwd" /><br>
    <input type="submit" value="登陆"/>
</form>
<a href="success.jsp">进入成功页面</a>
</body>
</html>
