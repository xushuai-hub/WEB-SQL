<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/8
  Time: 18:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="src.SQL" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<td>
    <%
        SQL sql = new SQL();
        sql.execute();

    %>


</td>
<table border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td>ads</td>
        <td>grade</td>
    </tr>

    <%
        int i = 0;
        while (!(i >= sql.listid.size())) {%>
    <tr>
        <td><%=sql.listid.get(i)%></td>
        <td><%=sql.listname.get(i)%></td>
        <td><%=sql.listage.get(i)%></td>
        <td><%=sql.listads.get(i)%></td>
        <td><%=sql.listgrade.get(i)%></td>
    </tr>

    <%
            i++;
        }
    %>

</table>

</body>
</html>