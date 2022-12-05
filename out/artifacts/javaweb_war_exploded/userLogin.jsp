<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: 25873
  Date: 2022/11/24
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登陆界面</title>
</head>
<body>
<%
    String name=null;
    String pwd=null;

    //从请求中获取cookie，是否可以直接登录
    Cookie[] cookies=request.getCookies();
    if (cookies!=null){
        for (Cookie cookie : cookies) {
            if (cookie!=null){
                if (cookie.getName().equals("nameCookie")){
                    name= URLDecoder.decode(cookie.getValue(),"utf8");
                }
                if (cookie.getName().equals("pwdCookie")){
                    pwd=cookie.getValue();
                }
            }
        }
    }
    if (name!=null&&pwd!=null){
        request.getRequestDispatcher("/user?code=login&name="+name+"&pwd="+pwd).forward(request,response);
    }
%>

<%
    Object o=request.getAttribute("msg");
    if (o!=null){
%>

<h1 style="color:red"><%=o%></h1>

<%
    }
%>
<form action="/user?code=login" method="post">
    <table border="1px" cellpadding="10px" cellspacing="0" align="center">
        <tr>
            <th colspan="2">登陆界面</th>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" value="${name}" placeholder="请输入姓名" required /></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="pwd" placeholder="请输入密码" required /></td>
        </tr>
        <tr>
            <%--            使用cookie实现简化登录--%>
            <td>免登录</td>
            <td>
                <select name="timeLength">
                    <option value="0">一直登陆</option>
                    <option value="7">7天内免登录</option>
                    <option value="15">15天内免登录</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="登陆"/>
                <input type="reset" value="重置"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
