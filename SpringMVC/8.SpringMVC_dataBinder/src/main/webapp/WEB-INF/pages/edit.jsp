<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: gaopeiwen
  Date: 2020/11/26
  Time: 2:25 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>
        员工修改
    </title>
</head>
<body>
<h1>员工修改</h1>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<form:form action="${ctp}/emp/${employee.id}" modelAttribute="employee" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="hidden" name="id" value="${employee.id}">
    email:<form:input path="email"></form:input><br>
    gender:男<form:radiobutton path="gender" value="1"></form:radiobutton>
    女<form:radiobutton path="gender" value="1"></form:radiobutton><br>
    dept:<form:select path="department.id" items="${depts}" itemLabel="departmentName" itemValue="id"></form:select><br>
    <input type="submit">
</form:form>
</body>
</html>
