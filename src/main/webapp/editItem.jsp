<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<body>
<div class="container-fluid">
    <h2>Edit Item</h2>
    <form method="POST" action="/editItemServlet">
        <label for="description">Description: </label>
        <input type="text" id="description" name="description" value="${item.getDescription()}"><br />
        <label for="amount">Amount: </label>
        <input type="text" id="amount" name="amount" value="${item.getAmount()}"><br />
        <label for="charity">Charity: </label>
        <input type="text" id="charity" name="charity" value="${item.getCharity()}"><br />
        <label for="date">Date: </label>
        <input type="text" id="date" name="date" value="${item.getDate}"><br />
        <input type="hidden" name="id" value="${item.id}" />
        <input type="submit" name="submit" value="Submit Item" />
    </form>
</div>
</body>
</html>
