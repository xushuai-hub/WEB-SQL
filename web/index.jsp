
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/17
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background: url(image/back.jpg)">
<div align="center">
    <h1 style="color:#3040af">系统登陆</h1>
    <form id="indexform" name="indexForm" action="LoginProcess.jsp" method="post">
        <table border="0">
            <tr>
                <td>用户名：</td>
                <td><input type="text" id="id" name="id"></td>
            </tr>
            <tr>
                <td>密码：</td>
                <td><input type="text" id="password" name="password"></td>
            </tr>

        </table>
        <br>
        <input type="submit" value="登录" tyle="color:#992058">
    </form>
</div>
</body>

</html>
