<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/21
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>age</th>
        <th>hiredate</th>
    </tr>
    <tbody>
    <c:forEach items="${list.list}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.age}</td>
            <td>${stu.hiredate}</td>
        </tr>
    </c:forEach></tbody>

</table>
<ul>
    <li><a href="/stu/list?pageNum=1">首页</a></li>
    <li><a href="/stu/list?pageNum=${list.prePage}">上一页</a></li>
    <li><a href="/stu/list?pageNum=${list.nextPage}">下一页</a></li>
    <li><a href="/stu/list?pageNum=${list.pages}">尾页</a></li>
    <e:forEach items="${list.navigatepageNums}" var="p">
        <li><a href="/stu/list?pageNum=${p}">${p}</a> </li>
    </e:forEach>
</ul>
</body>
</html>
