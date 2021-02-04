<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/4
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="file">
    <a href="down.do?fname=${file}">${file}</a>


</c:forEach>
</body>
</html>
