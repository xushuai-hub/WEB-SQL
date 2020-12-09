<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="src.SQL" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="java.math.BigDecimal" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form id="form" name="Form" action="deletesuccess.jsp" method="post">
        <table>
            <tr>
                <td>目标Id：</td>
                <td><input type="text" id="id" name="id"></td>
            </tr>
        </table>
        <input type="submit" value="提交" >
    </form>
</div>
</body>
</html>
