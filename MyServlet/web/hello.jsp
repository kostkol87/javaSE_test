<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>

<h1>Hello <% out.print(request.getParameter("name")); %></h1>

<ul>
    <c:forEach begin="0" end="9">
        <li>q</li>
    </c:forEach>
</ul>

<ul>
    <c:forEach begin="0" end="9" var="i">
        <li>
            <c:out value="${i}"/>
        </li>
    </c:forEach>
</ul>

<ul>
    <%
        for (int i = 0; i < 10; i++) {
    %>
    <li>
        <%
            out.print(i);
        %>
    </li>
    <%
        }
    %>
</ul>

</body>
</html>
