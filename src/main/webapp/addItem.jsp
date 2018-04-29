<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<body>
<div class="container-fluid">
    <h2>Add Item</h2>
    <form method="GET" action="addItemServlet">
        <label for="description">Description: </label>
        <input type="text" id="description" name="description" value=""><br />
        <label for="amount">Amount: </label>
        <input type="text" id="amount" name="amount" value=""><br />
        <label for="charity">Charity: </label>
        <select id="charity" name="charity">
            <option value="Good Will">Goodwill</option>
            <option value="Salvation Army">Salvation Army</option>
            <c:forEach var="charityName" items="${charityNames}">
                <option value="${charityName}">${charityName}</option>
            </c:forEach>
            <option value="Other">Other</option>
        </select><br />
        <label for="date">Date: </label>
        <input type="text" id="date" name="date" value=""><br />
        <input type="submit" name="submit" value="Submit Item" />
    </form>
</div>
</body>
</html>

