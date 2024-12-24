<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <head>
        <title>Simple Dictionary</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <h2>calculate Discount</h2>
        <form action="calculate Discount" method="POST">
            <label for="description">Product Description</label>
            <input type="text" id="description" name="description" required>

            <label for="listPrice">List Price</label>
            <input type="number" id="listPrice" name="listPrice" step="0.01" required>

            <label for="discountPercent">Discount Percent</label>
            <input type="number" id="discountPercent" name="discountPercent" step="0.01" required>

            <button type="submit">Calculate Discount</button>
        </form>
    </body>
</html>
