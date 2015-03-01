<%--
  Created by IntelliJ IDEA.
  User: Константин
  Date: 21.08.2014
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>result</title>
</head>
<%  String commandLine = request.getParameter("commandLine"); %>
<body>
 <% response.getWriter().print("result of parsing"+commandLine); %> <br>

</body>
</html>
