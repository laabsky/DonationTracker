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

    <!-- Contact -->

    <div class="contact">
        <div class="container">
            <div class="row">

                <div class="col-lg-6 contact_col">
                    <div class="estate_contact_form">
                        <div class="contact_title">User Search</div>
                        <div class="estate_contact_form_container">
                            <p>Leave the box empty for ALL users</p>
                            <form method="GET" id="validate" class="estate_contact_form" action="searchUser">
                                <label for="searchTerm">Search Term:</label><br />
                                <input type="text" id="searchTerm" class="estate_input_field estate_contact_form_name" name="searchTerm"><br />
                                <input type="submit" class="estate_contact_send_btn trans_200" name="submit" value="Search" />
                            </form>
                        </div>
                    </div>
                </div>


            </div>

        </div>
        <div class="container">
            <div class="row">
                <br />
                <br />
                <br />
            </div>

        </div>



        <%@include file="footer.jsp"%>

    </div>
    <%@include file="scripts.jsp"%>
</body>

</html>


