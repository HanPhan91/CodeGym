<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2022
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Condiments</title>
</head>
<body>
    <h1>List Condiments:</h1>
    <ul>
    <c:forEach items="${requestScope.condiments}" var="c"><li>${c}</li></c:forEach>
    </ul>
</body>
</html>
