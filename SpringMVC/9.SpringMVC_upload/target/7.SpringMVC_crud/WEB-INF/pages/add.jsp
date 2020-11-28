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
        员工添加
    </title>
</head>
<body>
<h1>员工添加</h1>
<%--<form action="" method="post">--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <td>lastName:</td>--%>
<%--            <td><input type="text" name="lastName"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>email:</td>--%>
<%--            <td><input type="text" name="email"></td>--%>
<%--        <tr>--%>
<%--            <td>gender:</td>--%>
<%--            <td>男<input type="radio" name="gender" value="1">--%>
<%--                女<input type="radio" name="gender" value="0"></td>--%>
<%--        <tr>--%>
<%--            <td>部门:</td>--%>
<%--            <td><select name="id">--%>
<%--                <c:forEach items="${depts}" var="dept">--%>
<%--                    <option value="${dept.id}">${dept.departmentName}</option>--%>
<%--                </c:forEach>--%>
<%--            </select></td>--%>
<%--    </table>--%>
<%--    <input type="submit">--%>
<%--</form>--%>
<%
    pageContext.setAttribute("ctp", request.getContextPath());
%>
<form:form action="${ctp}/emp" modelAttribute="employee" method="POST">
    lastName:<form:input path="lastName"></form:input><br>
    email:<form:input path="email"></form:input><br>
    gender:男<form:radiobutton path="gender" value="1"></form:radiobutton>
    女<form:radiobutton path="gender" value="1"></form:radiobutton><br>
    dept:<form:select path="department.id" items="${depts}" itemLabel="departmentName" itemValue="id"></form:select><br>
    <input type="submit">
</form:form>
</body>
</html>
