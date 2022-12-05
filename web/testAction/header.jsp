<%--
  Created by IntelliJ IDEA.
  User: 25873
  Date: 2022/11/29
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试-动态包含 include标准动作</title>
</head>
<body>
<%
    int x=Integer.parseInt(request.getParameter("x"));
    int y=Integer.parseInt(request.getParameter("y"));
%>
<h1><%=x/y%></h1>
</body>
</html>
