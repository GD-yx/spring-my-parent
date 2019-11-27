<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/10/23
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>编号</td>
            <td>名称</td>
        </tr>
        <c:forEach items="${deptlist}" var="dept">
            <tr>
                <td>${dept.id}</td>
                <td>${dept.deptname}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/index?page=${pagination.first}&pageSize=2">首页</a>
    <a href="/index?page=${pagination.prev}&pageSize=2">上一页</a>
    <a href="/index?page=${pagination.next}&pageSize=2">下一页</a>
    <a href="/index?page=${pagination.last}&pageSize=2">尾页</a>
</body>
</html>
