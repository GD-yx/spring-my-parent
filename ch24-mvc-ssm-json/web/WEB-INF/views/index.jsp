<%--
  Created by IntelliJ IDEA.
  User: 南八
  Date: 2019/11/19
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>index jsp</h1>
<table id="mytable">
    <tr>
        <th>id</th>
        <th>deptname</th>
    </tr>
    <tbody id="mybody">

    </tbody>
</table>
<input type="text" name="id" id="id"/>
<input type="text" name="username" id="deptname"/>

<input type="button" value="list" id="btnList"/>
<input type="button" value="insert" id="btnInsert"/>
<script>
    $(function(){
        getAll()
        function getAll(){
            $.ajax({
                url:"/index",
                type:"Post",
                dataType:"json",
                success:function (data) {
                    var html="";
                    $.each(data,function (index,data2) {
                        html+="<tr><td>"+data2.id+"</td>";
                        html+="<td>"+data2.deptname+"</td></tr>";
                    })
                    $("#mybody").html(html);
                }
            })
        }

        $("#btnInsert").click(function () {
            var data={id:$("#id").val(),deptname:$("#deptname").val()};
            $.ajax({
                url:"/insert",
                data:data,
                type:"Post",
                dataType:"json",
                success:function (data) {
                    alert(data.deptname);
                }

            })
        })

    });
</script>
</body>
</html>
