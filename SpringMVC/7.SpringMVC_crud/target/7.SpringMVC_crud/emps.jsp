<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: gaopeiwen
  Date: 2020/11/27
  Time: 9:37 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
<%=new Date()%>
<button id="reset"> ajax 获取员工信息</button>
<div></div>

<form action="request" method="post" enctype="multipart/form-data">
    <input type="text" name="username" value="gpw">
    <input type="text" name="password" value="123456">
    <input type="file" name="file">
    <input type="submit">
</form>
</body>

<script type="text/javascript">
    $("#reset").click(function () {
        $.ajax({
            url: "http://localhost:8080/crud/getall",
            type: "GET",
            success: function (data) {
                $.each(data, function () {
                    var empInfo = this.lastName + "-->" + this.birth + "-->" + this.gender;
                    $("div").append(empInfo + "<br>")
                });
            }
        });
    });
</script>
</html>
