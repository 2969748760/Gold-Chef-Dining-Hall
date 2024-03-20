<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
修改页面
<form action="updateFood?id=${selectedfood.id}" method="post">
    <p>菜名:<input name="dishes" value="${selectedfood.dishes}"></p>
    <p>价格:<input name="price" value="${selectedfood.price}"></p>
    <p>库存:<input name="inventory" value="${selectedfood.inventory}"></p>
    <p>生产日期:<input name="madetime" value='<fmt:formatDate value="${selectedfood.madetime}" pattern="yyyy-MM-dd HH:mm:ss"/>'></p>
    <p>保质期:<input name="shelflife" value="${selectedfood.shelflife}"></p>
    <p>概括:<input name="summary" value="${selectedfood.summary}"></p>
    <p>订购方式:<input name="orderway" value="${selectedfood.orderway}"></p>
    <p><input type="submit" value="修改"></p>
</form>
</body>
</html>
