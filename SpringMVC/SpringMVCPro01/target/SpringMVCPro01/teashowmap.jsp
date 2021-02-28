<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/4
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="teaupd.do" method="post">
    <c:forEach items="${map}" var="tea">
        教师编号:<input type="text" name="map[${tea.value.teaId}]" value="${tea.value.teaId}"><br>
        教师姓名:<input type="text" name="map[${tea.value.teaName}]" value="${tea.value.teaName}"><br>
    </c:forEach>
    <input type="submit" value="批量修改">
</form>
</body>
</html>
