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
        <div class="container">
            <%
                ArrayList<News> news = (ArrayList<News>) request.getAttribute("all-news");
                System.out.println("News size: " + (news != null ? news.size() : "null"));
                if (news != null) {
                    for (int i = 0; i < news.size(); i++) {
                        News novost = news.get(i);
            %>
            <div class="container" style="justify-content: center">
                <div class="card">
                    <div class="card-body">
                        <%
                            if (i % 2 == 0) {
                        %>
                        <h1 class="card-title"><%=novost.getName()%></h1>
                        <h2 class="card-text"><%=novost.getContent()%></h2>
                        <h2 class="card-text"><%=novost.getDate()%></h2>
                        <%
                        } else {
                        %>
                        <h2 class="card-text"><%=novost.getContent()%></h2>
                        <h1 class="card-title"><%=novost.getName()%></h1>
                        <h1 class="card-title"><%=novost.getDate()%></h1>
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
        </div>
    </section>
    <%@include file="footer.jsp"%>



</body>

</html>