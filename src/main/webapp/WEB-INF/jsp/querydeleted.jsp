<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<html>
<head>
    <title>querydeleted</title>
</head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3.3.7/css/bootstrap.css">

<body>
    <table class="table table-striped table-bordered table-hover table-condensed">
        <tr>
            <a href="foodList" class="btn btn-default">返回主页</a>
        </tr>
        <tr class="info">
            <td>彻底删除菜品</td>
            <td>编号</td>
            <td>菜名</td>
            <td>单价</td>
            <td>库存</td>
            <td>生产日期</td>
            <td>保质期</td>
            <td>概括</td>
            <td>订购方式</td>
            <td>修改订单</td>
        </tr>
        <c:forEach var="b" items="${pid.list}" varStatus="vs">
            <tr>
                <td>
                    <a href="deleteFoodCom?id=${b.id}" class="btn btn-danger">彻底删除</a>
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
                    <a href="restore?id=${b.id}" class="btn btn-warning">恢复菜品</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <%--分页器--%>
    <c:if test="${!pid.isFirstPage}">
        <a href="${pageContext.request.contextPath}/showmenu/deletedList">首页</a>
        <a href="${pageContext.request.contextPath}/showmenu/deletedList?pageNum=${pid.prePage}">上一页</a>
    </c:if>
    <c:if test="${!pid.isLastPage}">
        <a href="${pageContext.request.contextPath}/showmenu/deletedList?pageNum=${pid.nextPage}">下一页</a>
        <a href="${pageContext.request.contextPath}/showmenu/deletedList?pageNum=${pid.lastPage}">末页</a>
    </c:if>
    当前页:${pid.pageNum}/${pid.pages}
</body>
</html>
