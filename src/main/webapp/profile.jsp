<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="head.jsp"%>

<body>

<div class="super_container">

    <!-- Home -->
    <div class="home">
        <div class="home_background" style="background-image:url(images/donateHeart.png)"></div>

        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="home_content">
                        <div class="home_title">
                            <h2>Profile</h2>
                        </div>
                        <div class="breadcrumbs">
                            <span><a href="index.jsp">Home</a></span>
                            <span><a href="toAddItemServlet">Add Item</a></span>
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
                        <h3>${user.getFirstName()} ${user.getLastName()}</h3>
                        <span class="section_subtitle" style="margin-bottom:10px;">Your Donations</span>

                    </div>
                    <div class="section_title text-center">
                        <span class="estate_contact_send_btn trans_200" style="padding-top:5px;padding-bottom:5px;padding-right:20px;padding-left:20px;font-size:14px;margin-top:5%;"><a href="toAddItemServlet" style="color:#FFFFFF">Add Item</a></span>

                    </div>
                </div>
            </div>



            <div class="row featured_row">
                <div class="col-lg-12 featured_card_col">

                    <div class="featured_card_container">
                        <div class="card featured_card trans_300">
                            <div class="card-body">

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
                                                    <input type="submit" name="submit" value="Edit Item" style="background-color:#fd784f;color:#FFFFFF;padding-left:5px;padding-right:5px"/>
                                                </form>
                                            </td>
                                            <td>
                                                <form method="GET" action="deleteItemServlet">
                                                    <input type="hidden" name="id" value="${item.id}" />
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