<%@include file="head.jsp"%>
<html>
<body>
<h2>Donation Tracker</h2>
<p>Leave the box empty for ALL users</p>
<form method="GET" action="searchUser">
    <label for="searchTerm">Search Term:</label><br />
    <input type="text" id="searchTerm" name="searchTerm"><br />
    <input type="submit" name="submit" value="Search" />
</form>
</body>
</html>


