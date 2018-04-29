<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">


<body>

<div class="super_container">

    <!-- Home -->
    <div class="home">
        <div class="home_background" style="background-image:url(images/giveHeart.jpg)"></div>

        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="home_content">
                        <div class="home_title">
                            <h2>Edit Item</h2>
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

    <!-- Header -->

    <%@include file="header.jsp"%>

    <!-- Contact -->

    <div class="contact">
        <div class="container">
            <div class="row">

                <div class="col-lg-12 contact_col">
                    <div class="estate_contact_form">
                        <div class="contact_title">Edit Item</div>
                        <div class="estate_contact_form_container">
                            <form method="GET" class="estate_contact_form" action="editItemServlet">
                                <label for="description">Description: </label>
                                <input type="text" id="description" name="description" class="estate_input_field estate_contact_form_name" value="${item.getDescription()}"><br />
                                <label for="amount">Amount: </label>
                                <input type="text" id="amount" name="amount" class="estate_input_field estate_contact_form_name" value="${item.getAmount()}"><br />
                                <label for="charity">Charity: </label>
                                <input type="text" id="charity" name="charity" class="estate_input_field estate_contact_form_name" value="${item.getCharity()}"><br />
                                <label for="date">Date: </label>
                                <input type="text" id="date" name="date" class="estate_input_field estate_contact_form_name" value="${item.getDate()}"><br />
                                <input type="hidden" name="id" value="${item.getId()}" />
                                <input type="submit" name="submit" class="estate_contact_send_btn trans_200" value="Submit Item" />
                            </form>
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

