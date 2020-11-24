<%--
  Created by IntelliJ IDEA.
  User: gaopeiwen
  Date: 2020/11/24
  Time: 4:44 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%--/book/1--%>
<a href="book/1">查询图书</a>
<br>
<form action="book" method="post">
    <input type="submit" value="添加图书">
</form>
<br>
<form action="book/1" method="post">
    <input type="submit" value="修改图书">
    <input type="hidden" name="_method" value="put">
</form>
<br>
<form action="book/1" method="post">
    <input type="submit" value="删除图书">
    <input type="hidden" name="_method" value="delete ">
</form>
<br>
</body>
</html>
