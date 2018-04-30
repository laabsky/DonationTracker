<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>

<body>

<div class="super_container">

    <!-- Home -->
    <div class="home">
        <div class="home_background" style="background-image:url(images/give4.png)"></div>

        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="home_content">
                        <div class="home_title">
                            <h2>Admin</h2>
                        </div>
                        <div class="breadcrumbs">
                            <span><a href="index.jsp">Home</a></span>
                            <span><a href="toProfileServlet">Profile</a></span>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%@include file="header.jsp"%>

    <!-- Featured Properties -->

    <div class="featured">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="section_title text-center">
                        <h3>User Results</h3>

                    </div>

                </div>
            </div>



            <div class="row featured_row">
                <div class="col-lg-12 featured_card_col">

                    <div class="featured_card_container">
                        <div class="card featured_card trans_300">
                            <div class="card-body">

                                <table class="table table-striped table-bordered table-hover table-condensed">
                                    <tr><th>First Name</th><th>Last Name</th><th>User Name</th><th>Email</th><th></th></tr>
                                    <c:forEach var="user" items="${users}">
                                        <tr>
                                            <td>${user.getFirstName()}</td>
                                            <td>${user.getLastName()}</td>
                                            <td>${user.getUserName()}</td>
                                            <td>${user.getEmail()}</td>
                                            <td>
                                                <form method="GET" action="deleteUserServlet">
                                                    <input type="hidden" name="deleteId" value="${user.getId()}" />
                                                    <input type="image" name="delete" src="images/delete.png" style="width:25px"/>
                                                </form>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>

                            </div>
                        </div>

                    </div>

                </div>

            </div>
        </div>
    </div>



    <%@include file="footer.jsp"%>

</div>
<%@include file="scripts.jsp"%>
</body>

</html>
