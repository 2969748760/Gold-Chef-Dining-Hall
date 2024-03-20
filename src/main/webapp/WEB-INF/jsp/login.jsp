<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<html>
<head>
    <title>登录</title>
</head>

<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap3.3.7/css/bootstrap.css">

<body>
<form action="${pageContext.request.contextPath}/user/loginCheck" method="post">
    用户名:<input name="username">
    密码:<input type="password" name="password">
    <input type="submit" value="登录">
    <p>没有账户？<a href="register">注册</a>一个</p>
    <p><a href="resetpwd">忘记密码</a></p>
</form>
</body>
</html>
