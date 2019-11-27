<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/21
  Time: 23:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>student list</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="/static/js/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <link href="/static/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet"/>
</head>
<body>
<table class="table">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>address</th>
        <th>hiredate</th>
    </tr>
    <tbody>
    <c:forEach items="${students.list}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.address}</td>
            <td>${stu.hiredate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<ul class="pagination">
    <li><a href="/stu/list?pageNum=1">首页</a></li>
    <li><a href="/stu/list?pageNum=${students.prePage}">上一页</a></li>
    <c:forEach items="${students.navigatepageNums}" var="p">
        <li><a href="/stu/insert?pageNum=${p}">${p}</a></li>
    </c:forEach>
    <li><a href="/stu/list?pageNum=${students.nextPage}">下一页</a></li>
    <li><a href="/stu/list?pageNum=${students.pages}">尾页</a></li>
</ul>
</body>
</html>
