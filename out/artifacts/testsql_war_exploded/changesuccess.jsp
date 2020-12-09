<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="src.SQL" %>

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
        String sname = (String) request.getParameter("name");
        String sage = (String) request.getParameter("age");
        String sads = (String) request.getParameter("address");
        String sgrade = (String) request.getParameter("grade");

        int id = Integer.parseInt(sid);

        SQL sql = new SQL();
        sql.check(id);
        if (sname == "")
            sname = sql.name;

        if (sage == "")
            sage = sql.age;

        if (sads == "")
            sads = sql.ads;

        if (sgrade == "")
            sgrade = sql.grade;

        int age;
        age = Integer.parseInt(sage);
        int grade = Integer.parseInt(sgrade);
        sql.change(id,sname,age,sads,grade);
    %>

</td>
<script> window.setInterval("location='Dome.jsp'",3000); </script>
</body>
</html>