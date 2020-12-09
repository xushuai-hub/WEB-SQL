<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 18:18
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
<td>
    <%
        String sid = request.getParameter("id");

    int id = Integer.parseInt(sid);
    SQL sql = new SQL();
    sql.delete(id);
    System.out.print("删除成功，3秒后返回上一页");
    %>
</td>
<script> window.setInterval("location='Dome.jsp'",3000); </script>
  </body>
</html>
