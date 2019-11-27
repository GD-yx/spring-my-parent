<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/21
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>student add</title>
</head>
<body>
<form method="post" action="/stu/insert">
    <input type="text" name="id"/>
    <input type="text" name="name"/>
    <input type="text" name="address"/>
    <input type="text" name="hiredate"/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
