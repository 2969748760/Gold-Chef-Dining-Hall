<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加菜品</title>
</head>
<body>
添加菜品
<form action="addFood" method="post">
    <p>菜名:<input name="dishes"></p>
    <p>价格:<input name="price"></p>
    <p>库存:<input name="inventory"></p>
    <p>生产日期:<input name="madetime"></p>
    <p>保质期:<input name="shelflife"></p>
    <p>概括:<input name="summary"></p>
    <p>订购方式:<input name="orderway"></p>
    <p>销售状态:<input name="status"></p>
    <p><input type="submit" value="提交"></p>
</form>
</body>
</html>
