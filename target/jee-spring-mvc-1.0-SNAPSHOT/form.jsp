<%--
  Created by IntelliJ IDEA.
  User: karol
  Date: 24.04.2022
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form JSP</title>
</head>
<body>
<form method="post" action="form">
    <div>
        <label for="paramName">Name</label>
        <input name="paramName" id="paramName" type="text">
    </div>
    <div>
        <label for="paramDate">Date</label>
        <input name="paramDate" id="paramDate" type="date">
    </div>
    <div>
        <input type="submit">
    </div>
</form>

</body>
</html>
