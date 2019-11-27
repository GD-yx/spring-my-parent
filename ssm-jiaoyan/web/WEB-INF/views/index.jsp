<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/13
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加</h1>
<form method="get" action="/insert">
    学号：<input type="text" name="id"/><br/>
    姓名：<input type="text" name="name"/><br/>
    性别：<input type="text" name="sex"/><br/>
    年龄：<input type="text" name="age"/><br/>
    地址：<input type="text" name="address"/><br/>
    电话：<input type="text" name="phone"/><br/>
    <input type="submit" name="tijiao"/>
</form>
</body>
</html>
