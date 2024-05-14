<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration is successfully done</title>
    <%@include file="/links/links.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="row justify-content-center">
    <div class="col-3">
        <div class="row">
            <div class="col-12 mt-3">
                <h1>Welcome to EGEA Bochum, <%= session.getAttribute("username") %>!</h1>
            </div>
        </div>
    </div>
</div>
</body>
</html>
