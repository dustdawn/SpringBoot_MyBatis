<%--
  Created by IntelliJ IDEA.
  User: luobin
  Date: 2019/8/7
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
</head>
<body>
登录页面
<h6><a href="/user/to">${name}</a></h6>
<h3  style="color: red">登录</h3>
<form method="post" action="${pageContext.request.contextPath}/user/toIndex">
    用户名：<input type="text" name="login_name" /><br/>
    密码：<input type="password" name="password" /><br/>
    <input type="submit" value="登录"/>

</form>
</body>
</html>
