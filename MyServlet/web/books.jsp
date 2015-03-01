<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Books</title>
</head>
<body>
    <table border="1" cellpadding="10">
        <tr>
            <th>ID</th>
            <th>ISBN</th>
            <th>Название</th>
            <th>Дата выхода</th>
        </tr>
        <c:forEach items="${books}" var="b">
            <tr>
                <td>${b.id}</td>
                <td>${b.isbn}</td>
                <td>${b.name}</td>
                <td>${b.releaseDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
