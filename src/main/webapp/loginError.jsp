<!DOCTYPE html>
<html lang="en">


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
                            <h2>Error</h2>
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

    <div id="errorContainer">
        <h1>Error logging in. Please try again</h1>
        <span class="estate_contact_send_btn trans_200" style="padding-top:5px;padding-bottom:5px;padding-right:20px;padding-left:20px;font-size:14px;margin-top:5%;"><a href="login.jsp" style="color:#FFFFFF">Back to Login</a></span>
    </div>



    <%@include file="footer.jsp"%>

</div>
<%@include file="scripts.jsp"%>
</body>

</html>

