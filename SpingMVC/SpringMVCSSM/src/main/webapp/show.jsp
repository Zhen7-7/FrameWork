<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/5
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="e">
    ${e.empno}
    ${e.ename}
    ${e.job}
    ${e.hiredate}
    ${e.dept.deptno}
    ${e.dept.dname}
    ${e.dept.loc}<br/>
</c:forEach>
</body>
</html>
