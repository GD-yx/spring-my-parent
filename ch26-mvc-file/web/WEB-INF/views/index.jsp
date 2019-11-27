<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/20
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post"
      enctype="multipart/form-data" action="/upload">

    <input type="file" name="myfile"/>
    <input type="submit" value="提交"/>
</form>
<a href="/download?filename=xx灿烈.jpg">下载（文件名有中文）</a>
<a href="/download?filename=xx.jpg">下载</a>
<img src="/download?filename=xx.jpg"/>
</body>
</html>
