<%--
  Created by IntelliJ IDEA.
  User: 星尘
  Date: 2019/6/21
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action=""${pageContext.request.contextPath}/user/register" method="get" >
    <input type="text" name="username" >
    <input type="text" name="password" >
    <input type="submit" value="login" onsubmit="return false;">
</form>
</body>
</html>
