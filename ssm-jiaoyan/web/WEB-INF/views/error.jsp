<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/13
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>错误信息</h1>
<h2>${aa}</h2>
<c:forEach items="${aa}" var="a">
    <li>${a.field} ======== ${a.defaultMessage}</li>
</c:forEach>
</body>
</html>
