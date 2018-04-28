<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html>
<body>
<h2>Admin</h2>
<%--TODO Pretty up the results!--%>
<div class="container-fluid">
    <table class="table table-striped table-bordered table-hover table-condensed">
        <tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Email</th><th></th></tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.getFirstName()}</td>
                <td>${user.getLastName()}</td>
                <td>${user.getUserName()}</td>
                <td>${user.getEmail()}</td>
                <td>
                    <form method="POST" action="deleteUserServlet">
                        <input type="hidden" name="id" value="${user.getId()}" />
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
