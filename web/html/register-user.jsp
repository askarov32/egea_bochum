<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <%@include file="/links/links.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<form action="/registration-user" method="post">
    <div class="row justify-content-center">
        <div class="col-6">
            <div class="row">
                <div class="col-12 mt-3">
                    <label>full name</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="fullname" required class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>email</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="email" name="email" required class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>password</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="password" name="password" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>retype password</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="password" name="passwordRetype" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <button class="btn btn-sm btn-success">sign in</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>