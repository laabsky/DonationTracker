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
                            <h2>Sign In</h2>
                        </div>
                        <div class="breadcrumbs">
                            <span><a href="index.jsp">Home</a></span>
                            <span><a href="toSignupServlet">Sign Up</a></span>
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
                        <div class="contact_title">Sign In</div>
                        <div class="estate_contact_form_container">
                            <FORM ACTION="loginCheckServlet" id="validate" class="estate_contact_form" METHOD="GET">
                                <label for="userName">User Name: </label>
                                <input type="text" id="userName" class="estate_input_field estate_contact_form_name" name="userName" value=""><br />
                                <label for="password">Password: </label>
                                <input type="text" id="password" class="estate_input_field estate_contact_form_name" name="password" value=""><br />
                                <input type="submit" class="estate_contact_send_btn trans_200" name="submit" value="Log In" />
                            </FORM>
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


