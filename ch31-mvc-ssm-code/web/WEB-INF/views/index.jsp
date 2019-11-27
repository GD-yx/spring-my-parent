<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/25
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<script>
    $(function () {
        $.ajax({
            url:"/list",
            type:"GET",
            success:function (result) {
                /*alert(result[0].deptname)*/
                alert(result.msg);
                if(result.code=="200"){
                    alert(result.data[0].deptname);
                }
            }
        })
    })
</script>
</body>
</html>
