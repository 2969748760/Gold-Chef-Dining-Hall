<%--
  Created by IntelliJ IDEA.
  User: 钟先生
  Date: 2022/10/8
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/signup" method="post">
    <p>用户名:<input name="username"></p>
    <p>密码:<input type="password" name="password"></p>
    <p>电话号码:<input name="phonenumber"></p>
    <p>邮箱:<input name="email"></p>
    <p>真实姓名:<input name="realname"></p>
    <p>性别:<input name="sex"></p>
    <p>年龄:<input name="age"></p>
    <input type="submit" value="注册">
</form>
</body>
</html>
