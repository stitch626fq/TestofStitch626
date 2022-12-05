<%@ page import="com.jky.day1124.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: 25873
  Date: 2022/11/24
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: lightseagreen">请求作用域：
    <%
        Object o=request.getAttribute("user");
        if (o!=null){
    %>
    欢迎<%=((User)o).getName()%>登陆成功
    <%
        }
    %>
</h1>

<h1 style="color: lightsalmon">会话作用域：
    <%
        Object oo=session.getAttribute("u");
        if (oo!=null){
    %>
    欢迎<%=((User)oo).getName()%>登陆成功
    <%
        }
    %>
</h1>

</body>
</html>
