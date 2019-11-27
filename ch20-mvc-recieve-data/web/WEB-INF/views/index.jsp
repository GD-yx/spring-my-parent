<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/11
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> index page</h1>

<h1>传递list数据给控制器</h1>

<form method="get" action="/list">

    <input type="text" name="emps[0].id"/>
    <input type="text" name="emps[0].username"/><br/>

    <input type="text" name="emps[1].id"/>
    <input type="text" name="emps[1].username"/>

    <input type="submit" value="tijiao"/>
</form>

<h1>绑定到数组</h1>

<form method="get" action="/array">
    <input type="text" name="username"/><br/>
    <input type="text" name="username"/><br/>
    <input type="text" name="username"/><br/>
    <input type="submit" value="tijiao"/>
</form>
</body>
</html>
