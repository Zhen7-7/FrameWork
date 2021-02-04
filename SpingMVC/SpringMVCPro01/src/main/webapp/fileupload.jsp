<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/4
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="upload.do" method="post" enctype="multipart/form-data" >
        上传人姓名:<input type="text" name="uploadName"/>
        上传文件  :<input type="file" name="upfile"><img src="${url}"/><br>${url}
        <input type="submit" value="上传文件">
    </form>
</body>
</html>
