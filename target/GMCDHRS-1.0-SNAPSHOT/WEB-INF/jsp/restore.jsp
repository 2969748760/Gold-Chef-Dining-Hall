<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
修改页面
<form action="restoreFood?id=${deletedfood.id}" method="post">
    <p>菜名:<input name="dishes" value="${deletedfood.dishes}"></p>
    <p>价格:<input name="price" value="${deletedfood.price}"></p>
    <p>库存:<input name="inventory" value="${deletedfood.inventory}"></p>
    <p>生产日期:<input name="madetime" value='<fmt:formatDate value="${deletedfood.madetime}" pattern="yyyy-MM-dd HH:mm:ss"/>'></p>
    <p>保质期:<input name="shelflife" value="${deletedfood.shelflife}"></p>
    <p>概括:<input name="summary" value="${deletedfood.summary}"></p>
    <p>订购方式:<input name="orderway" value="${deletedfood.orderway}"></p>
    <p><input type="submit" value="恢复"></p>
</form>
</body>
</html>
