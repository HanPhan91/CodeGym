<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/24/2021
  Time: 9:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <h1>Product Discount Calculator</h1>
    <form action="/display-discount" method="post">
      <p>Mô tả sản phẩm</p>
      <input type="text" name="desc">
      <p>Giá niêm yết sản phẩm</p>
      <input type="text" name="price">
      <p>Tỷ lệ phần trăm chiết khấu (%)</p>
      <input type="text" name="discount">
      <input type="submit" value="Calculate Discount">
    </form>
  </body>
</html>
