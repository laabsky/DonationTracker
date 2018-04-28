<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html>
<body>
<div class="container-fluid">
    <c:forEach var="user" items="${users}">
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
                            <form method="POST" action="toEditItemServlet">
                                <input type="hidden" name="id" value="${item.id}" />
                                <input type="submit" name="submit" value="Edit Item" />
                            </form>
                        </td>
                        <td>
                            <form method="POST" action="deleteItemServlet">
                                <input type="hidden" name="id" value="${item.id}" />
                                <input type="image" name="delete" src="images/delete.jpg" />
                            </form>
                        </td>
                    </tr>
                </c:forEach>

        </table>
    </c:forEach>
</div>

<a href="index.jsp">Home</a>
</body>
</html>