<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/8
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="src.SQL" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <input type="button" value="删除信息" onclick="next1()">
    <input type="button" value="增加信息" onclick="next2()">
    <input type="button" value="修改信息" onclick="next3()">

    <td>
        <%
            SQL sql = new SQL();
            sql.execute();

        %>


    </td>
    <table border="1" cellspacing="0" style="margin-top: 50px;width: 450px;height: 300px" >

        <tr>
            <td style="font-weight: 700">ID</td>
            <td style="font-weight: 700">NAME</td>
            <td style="font-weight: 700">AGE</td>
            <td style="font-weight: 700">ADDRESS</td>
            <td style="font-weight: 700">GRADE</td>
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
</div>
</body>

<script type="text/javascript">

    function next1(){

        window.location = "delete.jsp";

    }

    function next2(){

        window.location = "addsql.jsp";

    }

    function next3(){

        window.location = "change.jsp";

    }

</script>


</html>
