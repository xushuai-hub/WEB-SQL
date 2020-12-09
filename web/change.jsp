<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form id="indexform" name="indexForm" action="changesuccess.jsp" method="post">
        <table>
            <tr>
                <td>Id：</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>name：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>age：</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>address：</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>grade：</td>
                <td><input type="text" name="grade"></td>
            </tr>
        </table>
        <input type="submit" value="提交" >
    </form>
</div>


</body>
</html>
