<%@ page import="Models.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Models.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>News - EGEA Bochum</title>
    <link rel="stylesheet" href="/styles/news.css">
    <%@include file="/links/links.jsp"%>
</head>
<body>
    <%@include file="navbar.jsp"%>
    <section class="fon">
        <div class="box">OUR NEWS FOR TODAY</div>
    </section>

    <section class="feed">
        <div class="feed_container">
            <nav class="navbar bg-body-tertiary">
                <div class="container-fluid">
                    <form class="d-flex" role="search">
                        <input class="form-control me-md-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-secondary" type="submit">Search</button>
                    </form>
                </div>
            </nav>
            <div class="title">what's going on nowadays</div>
        </div>
    </section>
    <section>
        <%
            ArrayList<News> news = (ArrayList<News>) request.getAttribute("all-news");
            System.out.println("Event size: " + (news != null ? news.size() : "null"));
            if (news != null) {
                for (int i = 0; i < news.size(); i++) {
                    News news1 = news.get(i);
        %>
        <div class="container">
            <div class="row">
                <div class="card">
                        <%
                            if (i % 2 == 0) {
                        %>
                        <div class="row">
                            <div class="col-md-3">
                                <h1 class="card-title"><%=news1.getName()%></h1>
                            </div>
                            <div class="col-md-9">
                                <h2 class="card-text" style="font-weight: inherit; font-size: 20px"><%=news1.getContent()%></h2>
                            </div>
                            <div class="col-md-9">
                                <h2 class="card-text"><%=news1.getDate()%></h2>
                            </div>
                        </div>
                        <%
                        } else {
                        %>
                        <div class="row">
                            <div class="col-md-9">
                                <h1 class="card-text" style="font-weight: inherit; font-size: 20px"><%=news1.getContent()%></h1>
                            </div>
                            <div class="col-md-3">
                                <h2 class="card-title"><%=news1.getName()%></h2>
                            </div>
                            <div class="col-md-3">
                                <h2 class="card-text"><%=news1.getDate()%></h2>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="card-images">
                                    <%
                                        ArrayList<String> images = news1.getImages();
                                        if (images != null && !images.isEmpty()) {
                                            for (String imageUrl : images) {
                                    %>
                                    <img src="<%=imageUrl%>" alt="news image" class="img-fluid">
                                    <%
                                            }
                                        }
                                    %>
                                </div>
                            </div>
                        </div>
                        <%
                            }
                        %>
                </div>
            </div>
        </div>
        <br>
        <%
                }
            }
        %>
    </section>
    <%@include file="footer.jsp"%>
</body>

</html>