<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html>
<body>
<h2>Profile</h2>
<div class="container-fluid">
        <h2>${user.getFirstName()} ${user.getLastName()}</h2>
        <a href="toAddItemServlet">Add Item</a>
        <table class="table table-striped table-bordered table-hover table-condensed">
            <tr><th>Description</th><th>Amount</th><th>Charity</th><th>Date</th><th></th><th></th></tr>
                <c:forEach var="item" items="${user.items}">
                    <tr>
                        <td>${item.description}</td>
                        <td>${item.amount}</td>
                        <td>${item.charity}</td>
                        <td>${item.date}</td>
                        <td>
                            <form method="GET" action="toEditItemServlet">
                                <input type="hidden" name="id" value="${item.id}" />
                                <input type="submit" name="submit" value="Edit Item" />
                            </form>
                        </td>
                        <td>
                            <form method="GET" action="deleteItemServlet">
                                <input type="hidden" name="id" value="${item.id}" />
                                <input type="image" name="delete" src="images/delete.jpg" />
                            </form>
                        </td>
                    </tr>
                </c:forEach>

        </table>
</div>

<a href="index.jsp">Home</a>
</body>
</html>