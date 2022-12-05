<%--
  Created by IntelliJ IDEA.
  User: 25873
  Date: 2022/11/23
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table border="1" cellpadding="0" cellspacing="0">
    <form action="login" method="post">
        <tr>
          <th colspan="2"><font fontsize="6"><b>登陆界面</b></font></th>
        </tr>
        <tr>
            <th>姓名</th>
            <th>
                <input name="username" type="text">
            </th>
        </tr>
        <tr>
            <th>密码</th>
            <th>
                <input name="password" type="password">
            </th>
        </tr>
        <tr>
            <th>常用地址</th>
            <th>
                <input type="radio" name="address" value="1">安徽
                <input type="radio" name="address" value="2">江苏
                <input type="radio" name="address" value="3">湖北
            </th>
        </tr>
        <tr>
            <th colspan="2">
                <input type="submit" value="提交">
                <input type="reset" value="重置">
            </th>
        </tr>
    </form>
</table>
</body>
</html>
