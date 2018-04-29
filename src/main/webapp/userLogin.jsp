<%@include file="head.jsp"%>
<html>
<body>
<div id="loginContainer">
    <FORM ACTION="loginCheckServlet" METHOD="GET">
        <label for="userName">User Name: </label>
        <input type="text" id="userName" name="userName" value=""><br />
        <label for="password">Password: </label>
        <input type="text" id="password" name="password" value=""><br />
        <input type="submit" name="submit" value="Log In" />
    </FORM>
</div>
<a href="index.jsp">Home</a>
</body>
</html>
