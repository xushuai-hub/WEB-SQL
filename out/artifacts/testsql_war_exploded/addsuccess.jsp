<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/9
  Time: 21:05
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
      request.setCharacterEncoding("utf-8");
      String sid = (String) request.getParameter("id");
      String name = (String) request.getParameter("name");
      String sage = (String) request.getParameter("age");
      String ads = (String) request.getParameter("address");
      String sgrade = (String) request.getParameter("grade");

      int id = Integer.parseInt(sid);

      int age = Integer.parseInt(sage);

      int grade = Integer.parseInt(sgrade);
      SQL sql = new SQL();
      sql.insert(id,name,age,ads,grade);

  %>
</td>
<script> window.setInterval("location='Dome.jsp'",3000); </script>
  </body>
</html>
