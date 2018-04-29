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
                            <h2>Sign Up</h2>
                        </div>
                        <div class="breadcrumbs">
                            <span><a href="index.jsp">Home</a></span>
                            <span><a href="userLogin.jsp">Sign In</a></span>
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
                        <div class="contact_title">Sign Up</div>
                        <div class="estate_contact_form_container">
                            <form method="GET" class="estate_contact_form" action="signupServlet">
                                <label for="firstName">First Name: </label>
                                <input type="text" id="firstName" class="estate_input_field estate_contact_form_name" name="firstName"><br />
                                <label for="lastName">Last Name: </label>
                                <input type="text" id="lastName" class="estate_input_field estate_contact_form_name" name="lastName"><br />
                                <label for="userName">Username: </label>
                                <input type="text" id="userName" class="estate_input_field estate_contact_form_name" name="userName"><br />
                                <label for="password">Password: </label>
                                <input type="text" id="password" class="estate_input_field estate_contact_form_name" name="password"><br />
                                <label for="email">Email: </label>
                                <input type="text" id="email" class="estate_input_field estate_contact_form_name" name="email"><br />
                                <input type="submit" name="submit" class="estate_contact_send_btn trans_200" value="Sign Up" />
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
