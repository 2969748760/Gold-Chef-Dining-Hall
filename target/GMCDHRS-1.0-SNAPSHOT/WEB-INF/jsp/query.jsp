<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>query</title>
</head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3.3.7/css/bootstrap.css">

<body>
    <table class="table table-striped table-bordered table-hover table-condensed">
        <tr>
            <form action="${pageContext.request.contextPath}/showmenu/fuzzyQuery" method="post">
                搜索:<input name="dishes">
                <input type="submit" value="搜索" class="btn">
            </form>
        </tr>
        <tr>
            <a href="<%--${pageContext.request.contextPath}/showmenu/add--%>add" class="btn btn-primary">添加菜品</a>
            <a href="deletedList" class="btn btn-default">回收站</a>
            <a href="${pageContext.request.contextPath}/user/logout" class="btn btn-danger">退出登录</a>
        </tr>
        <tr class="info">
            <td>下架菜品</td>
            <td>编号</td>
            <td>菜名</td>
            <td>单价</td>
            <td>库存</td>
            <td>生产日期</td>
            <td>保质期</td>
            <td>概括</td>
            <td>订购方式</td>
            <td>修改菜品信息</td>
        </tr>
        <c:forEach var="b" items="${pi.list}" varStatus="vs">
            <tr>
                <td>
                    <a href="deleteFoodTmp?id=${b.id}" class="btn btn-danger">删除</a>
                </td>
                <td>${vs.count}</td>
                <td>${b.dishes}</td>
                <td>${b.price}</td>
                <td>${b.inventory}</td>
                <td><fmt:formatDate value="${b.madetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                <td>${b.shelflife}</td>
                <td>${b.summary}</td>
                <td>${b.orderway}</td>
                <td>
                    <a href="showFood?id=${b.id}" class="btn btn-warning">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <%--分页器--%>
    <c:if test="${!pi.isFirstPage}">
        <a href="${pageContext.request.contextPath}/showmenu/foodList">首页</a>
        <a href="${pageContext.request.contextPath}/showmenu/foodList?pageNum=${pi.prePage}">上一页</a>
    </c:if>
    <c:if test="${!pi.isLastPage}">
        <a href="${pageContext.request.contextPath}/showmenu/foodList?pageNum=${pi.nextPage}">下一页</a>
        <a href="${pageContext.request.contextPath}/showmenu/foodList?pageNum=${pi.lastPage}">末页</a>
    </c:if>
    当前页:${pi.pageNum}/${pi.pages}
</body>
</html>
