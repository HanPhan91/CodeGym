<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/18/2022
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SandWich Condiments</title>
  </head>
  <body>
  <h1>SandWich Condiments</h1>
      <form  action="list-condiments" method="get">
        <input type="checkbox" value="lettuce" name="condiments">Lettuce<br>
        <input type="checkbox" value="tomato" name="condiments">Tomato<br>
        <input type="checkbox" value="mustard" name="condiments">Mustard<br>
        <input type="checkbox" value="sprouts" name="condiments">Sprouts<br>
        <input type="submit" value="Save">
      </form>
  </body>
</html>
