<%@ page import="Models.Event" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Events</title>
    <%@include file="/links/links.jsp"%>
</head>
<body>

<form action="/event-update" method="post">
    <div class="row justify-content-center">
        <div class="col-6">
            <%
                Event event = (Event) request.getAttribute("event_one");
                if (event != null) {
            %>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>id</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="eventId" value="<%=event.getId()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>name</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="eventName" value="<%=event.getName()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>content</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="text" name="eventContent" value="<%=event.getContent()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>date</label>
                </div>
                <div class="col-12 mt-3">
                    <input type="date" name="eventDate" value="<%=event.getContent()%>" class="form-control">
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <button class="btn btn-sm btn-success">update</button>
                </div>
            </div>
            <div class="row">
                <div class="col-12 mt-3">
                    <label>images</label>
                </div>
                <div class="col-12 mt-3">
                    <!-- Add inline styling for image size -->
                    <input type="text" name="eventImages" value="<%=event.getImages()%>" class="form-control" style="max-width: 300px;" placeholder="Enter image URLs">
                    <!-- <input type="text" name="eventImages" value="<%=event.getImages()%>" class="form-control img-input" placeholder="Enter image URLs"> -->
                </div>
            </div>

            <%
                }
                assert event != null;%>
        </div>
    </div>
</form>
<form action="/event-delete" method="post">
    <div class="row justify-content-center">
        <div class="col-6">
            <input type="hidden" name="eventId" value="<%=event.getId()%>">
            <button class="btn btn-danger btn-sm" style="width: 65px">delete</button>
        </div>
    </div>
</form>
</body>
</html>