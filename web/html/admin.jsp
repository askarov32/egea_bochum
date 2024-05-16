<%@ page import="Models.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Models.Event" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Admin's panel</title>
    <%@include file="/links/links.jsp" %>
</head>
<body>
<%@include file="navbar.jsp" %>
<% if (user == null || user.getRole_id() == 2)  { %>
<div class="row justify-content-center">
    <div class="col-6">
        <div class="row">
            <div class="col-12 mt-3">
                <h1 class="text-center text-danger">access is denied!</h1>
            </div>
        </div>
    </div>
</div>
<% } %>

<% if (user != null && user.getRole_id() == 1) {%>
<div class="container" style="padding-top: 10px">
        <%
            ArrayList<News> news = (ArrayList<News>) request.getAttribute("news-admin");
            if (news != null) {
                for (News novost : news) {
        %>
        <div class="card">
            <div class="card-body">
                <h1 class="card-title"><%=novost.getName()%></h1>
                <%
                    ArrayList<String> images = novost.getImages();
                    if (images != null && !images.isEmpty()) {
                        for (String imageUrl : images) {
                %>
                <img src="<%=imageUrl%>" alt="News Image" style="max-width: 100%; height: auto; margin-bottom: 10px;">
                <%
                        }
                    }
                %>
                <p class="card-text"><%=novost.getContent()%></p>
                <p class="card-text"><%=novost.getDate()%></p>
                <p><a href="/news-details?id=<%=novost.getId()%>" class="btn btn-sm btn-success">details</a></p>
            </div>
        </div>
        <%
                }
            }
        %>
    </div>


<form action="/add-news" method="post" enctype="multipart/form-data">
    <div class="row">
        <div class="col-6 text-md-start">
            <div class="row">
                <div class="col-12 mt-3">
                    <label>name</label>
                </div>
                <div class="col-12 mt-3">
                    <input type='text' name='newsName' class='form-control'>
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>content</label>
                </div>
                <div class="col-12 mt-3">
                    <input type='text' name='newsContent' class='form-control'>
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>date</label>
                </div>
                <div class="col-12 mt-3">
                    <input type='date' name='newsDate' class='form-control'>
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>images</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="newsImages" class="form-control" placeholder="Enter image URLs (separated by commas)">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <button type="submit" class="btn btn-secondary">add news</button>
                </div>
            </div>
        </div>
    </div>
</form>

<br>
<br>

<div class="container">
    <%
        ArrayList<Event> events = (ArrayList<Event>) request.getAttribute("events-admin");
        if (events != null) {
            for (Event event : events) {
    %>
    <div class="card">
        <div class="card-body">
            <h1 class="card-title"><%=event.getName()%></h1>
            <%
                    ArrayList<String> images = event.getImages();
                    if (images != null && !images.isEmpty()) {
                        for (String imageUrl : images) {
                %>
                <img src="<%=imageUrl%>" alt="News Image" style="max-width: 100%; height: auto; margin-bottom: 10px;">
                <%
                        }
                    }
                %>
            <p class="card-text"><%=event.getContent()%>
            </p>
            <p class="card-text"><%=event.getDate()%>
            </p>
            <p><a href="/event-details?id=<%=event.getId()%>" class="btn btn-sm btn-success">details</a></p>

        </div>
    </div>
    <br>
    <%
            }
        }
    %>
    <form action="/add-event" method="post">
        <div class="row">
            <div class="col-6 text-md-start">
                <div class="row">
                    <div class="col-12 mt-3">
                        <label>name</label>
                    </div>
                    <div class="col-12 mt-3">
                        <input type='text' name='eventName' class='form-control'>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 mt-3">
                        <label>content</label>
                    </div>
                    <div class="col-12 mt-3">
                        <input type='text' name='eventContent' class='form-control'>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 mt-3">
                        <label>date</label>
                    </div>
                    <div class="col-12 mt-3">
                        <input type='date' name='eventDate' class='form-control'>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 mt-3">
                        <button type="btn" class="btn btn-secondary">add event</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
<% } %>
</body>
</html>

