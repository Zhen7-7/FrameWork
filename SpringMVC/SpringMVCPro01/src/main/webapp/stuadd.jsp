<%--
  Created by IntelliJ IDEA.
  User: Zhen77
  Date: 2021/2/3
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="add.do" method="post">
    学生编号:<input type="text" name="stuId"/><br>
    学生姓名:<input type="text" name="stuName"><br>
    学生身高:<input type="text" name="stuHeight"><br>
    是否毕业:<input type="radio" name="isGraduate" value="true">已毕业
            <input type="radio" name="isGraduate" value="false">未毕业<br>
    教师编号:<input type="text" name="tea.teaID" /><br>
    教师姓名:<input type="text" name="tea.teaName"/><br>
    您喜欢的爱好是:
    <input type="checkbox" name="likes" value="eat">吃饭<br>
    <input type="checkbox" name="likes" value="sleep">睡觉<br>
    <input type="checkbox" name="likes" value="play">玩游戏<br>

    <input type="date" name="dt"/>

    <input type="submit" value="添加"/>
 </form>
</body>
</html>
