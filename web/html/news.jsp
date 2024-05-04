<%@ page import="Models.News" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>News - EGEA Bochum</title>
    <link rel="stylesheet" href="/styles/news.css">
    <%@include file="/links/links.jsp" %>
</head>

<body>
    <header class="header">
        <div class="container">
            <div class="logo">
                <a href="/html/main.jsp"><img src="/images/Logo1.png" alt="logo"/></a>
            </div>
            <div class="burger"
                onclick="document.querySelector('.nav').classList.toggle('active'); document.querySelector('.burger').classList.toggle('active'); ">
                <span class="bar"></span>
                <span class="bar"></span>
                <span class="bar"></span>
            </div>
            <nav class="nav">
                <ul class="menu">
                    <li><a href="/html/main.jsp">Home</a></li>
                    <li><a href="/html/news.jsp">News</a> </li>
                    <li><a href="/html/events.jsp">Events</a></li>
                    <li><a href="/html/about.jsp">About us</a></li>
                    <li><a href="/html/contact.jsp">Contact</a></li>
                    <li class="hidden_login"><a href="#">Log in</a></li>
                </ul>
            </nav>
            <div class="login">
                <button class="button">
                    Log in
                </button>
            </div>
        </div>
    </header>

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
                if (news != null) {
                    for (News novost : news) {
            %>
            <div class="card">
                <div class="card-body">
                    <h1 class="card-title"><%=novost.getName()%></h1>
                    <h2 class="card-text"><%=novost.getContent()%></h2>
                </div>
            </div>
            <%
                    }
                }
            %>
        </div>
    </section>


</body>

</html>