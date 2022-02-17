<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en" xmlns:form="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>Setting</title>
</head>
<body>
<h1>Setting:</h1>
<form:form method="post" modelAttribute="setting" action="/info">
    <table>
        <tr>
            <td><form:label path="language">Languages:</form:label></td>
            <td><select name="language" path="language">
                <option value="Vietnamese">VietNam</option>
                <option value="English">English</option>
                <option value="Japanese">Japanese</option>
                <option value="Chinese">Chinese</option>
            </select>
            </td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size:</form:label></td>
            <td>
                <span>Show </span><select name="pageSize" path="pageSize">
                <option value="5">5</option>
                <option value="10">10</option>
                <option value="15">15</option>
                <option value="25">25</option>
                <option value="50">50</option>
                <option value="100">100</option>
            </select> emails per page
            </td>
        </tr>
        <tr>
            <td><form:label path="spamFilter">Span filter:</form:label></td>
            <td>
                <input type="checkbox" path="spamFilter" name="spamFilter"> <span> Enable spams filter</span>
            </td>
        </tr>
        <tr>
            <td><form:label path="sign">Signature:</form:label></td>
            <td>
                <input type="textarea" path="sign" name="sign">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update">
                <button onclick="window.location('/info')">Cancel</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>