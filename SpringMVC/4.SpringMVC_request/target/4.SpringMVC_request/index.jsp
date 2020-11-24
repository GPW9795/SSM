<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<a href="hello?username=gpw">Hello World!</a>
<br>
<form action="book" method="post">
    书名：<input type="text" name="bookName"><br>
    作者：<input type="text" name="author"><br>
    价格：<input type="text" name="price"><br>
    库存：<input type="text" name="stock"><br>
    销量：<input type="text" name="sales"><br>
    省：<input type="text" name="address.province"><br>
    市：<input type="text" name="address.city"><br>
    街道：<input type="text" name="address.street"><br>
    <input type="submit">
</form>
</body>
</html>
