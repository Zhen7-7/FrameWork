<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/3
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入jstl标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="teaupd.do" method="post">
    <c:forEach items="${list}" var="tea" varStatus="status" >
        教师编号:<input type="text" name="teas[${status.index}.teaId]" value="${tea.teaId}"/><br>
        教师姓名:<input type="text" name="teas[${status.index}.teaName]" value="${tea.teaName}"/><br>
    </c:forEach>
    <input type="submit" value="批量修改"/>
</form>

</body>
</html>
