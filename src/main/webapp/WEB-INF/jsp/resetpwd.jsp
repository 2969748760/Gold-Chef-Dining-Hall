<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重置密码</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/reSetPassword" method="post">
    <p>用户名:<input name="username"></p>
    <p>新的密码:<input name="password" type="password"></p>
    <p>电话号码:<input name="phonenumber"></p>
    <p><input type="submit" value="修改"></p>
</form>
</body>
</html>
