<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Models.User" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <title>Welcome to EGEA Bochum</title>
    <link rel="stylesheet" href="/styles/main.css">
    <script src="/scripts/main.js"></script>
</head>
<body>
<%@include file="navbar.jsp"%>

<section class="main">
    <div class="box"></div>
    <div class="container">
        <div class="info_card">
            <h1 class="info_card_title">What is EGEA?</h1>
            <p class="info_card_text">EGEA is the European Geography Association. It is a network of young people that are either studying geography, have studied geography or are interested in geography as a scientific subject. There are regular congresses and events and it is an easy way to travel through Europe on a low budget, since members enjoy visiting each other.</p>
            <div class="action">
                <button class="button">Learn more</button>
            </div>
        </div>
    </div>
</section>

<section class="info">
    <div class="info_1">
        <h2>Welcome to EGEA Bochum!</h2>
        <p>EGEA Bochum is an active member of EGEA. We are a group of young people that meet up regularly for geography-related events - and to have fun! :D</p>
    </div>
    <div class="earth">
        <img src="/images/Earth.png"/>
    </div>
    <div class="info_2_container">
        <div class="info_2_pic"><img src="/images/egea_group_icon.png"></div>
        <div class="info_2">
            <h2>What is our mission? What are our values?</h2>
            <p>Our mission is to promote geography as a scientific subject and to foster international exchange among people interested in it. We are non-partisan and not politically involved, yet strongly believe in the values and the idea of the European Union as a project of peace, solidarity and international and intercultural friendship. Therefore, we are tolerant and open towards everyone and treat anyone who wants to get involved with respect and human decency. We are proud scientists and professionals that believe that local work in science and the community is the best way to help build a sustainable future in Europe.</p>
        </div>
    </div>
</section>
<div class="back_logo">
    <img src="/images/logo.jpg"/>
</div>

<section class="video_box">
    <video muted="muted" autoplay='autoplay' src="/videos/rickroll.mp4"></video>
</section>

<section class="interest">
    <img src="/images/earth2.png"/>
    <div class="form">
        <div class="form_title">Interested? Then join us!</div>
        <div class="form_text"> We are very happy to welcome you! There is no sign-up required and you can also join any of our events without having to get involved with EGEA Bochum.</div>
        <div class="form_button">
            <button class="button">EGEAbfahrt!</button>
        </div>
    </div>
</section>

<section class="news">
    <div class="news_container">
        <div class="news_title">
            <h5>Latest news</h5>
        </div>
        <div class="news_list">
            <div class="news_card">
                <div class="news_card_pic"><img src="/images/IMG_1447.JPG"></div>
                <div class="news_card_title">Example and eeeh</div>
                <div class="news_card_text">Brain is not braining, Matthew pls do some texts i do not have a clue what to wtire here eh ah eh ah...</div>
                <div class="news_card_link">
                    <a href="#">Read more...</a>
                </div>
            </div>
            <div class="news_card">
                <div class="news_card_pic"><img src="/images/IMG_3836.JPG"></div>
                <div class="news_card_title">Example</div>
                <div class="news_card_text">Matthew pls pleaz pleaze zodo some texts i do not have a clue what to wtire here eh ah eh ah...</div>
                <div class="news_card_link">
                    <a href="#">Read more...</a>
                </div>
            </div>
            <div class="news_card">
                <div class="news_card_pic"><img src="/images/IMG_1531.JPG"></div>
                <div class="news_card_title">Another one</div>
                <div class="news_card_text">Kksj osfsdoihf dsnOIJod josjosad dvkjskjv ksvdjsdlkn jxn ...</div>
                <div class="news_card_link">
                    <a href="#">Read more...</a>
                </div>
            </div>
        </div>
        <div class="more">
            <a href="#">More news...</a>
        </div>
    </div>
</section>

<section class="events">
    <div class="news_container">
        <div class="news_title">
            <h5>Upcoment events</h5>
        </div>
        <div class="news_list">
            <div class="news_card">
                <div class="news_card_pic"><img src="/images/IMG_1447.JPG"></div>
                <div class="news_card_title">Example and eeeh</div>
                <div class="news_card_text">Brain is not braining, Matthew pls do some texts i do not have a clue what to wtire here eh ah eh ah...</div>
                <div class="news_card_link">
                    <a href="#">Read more...</a>
                </div>
            </div>
            <div class="news_card">
                <div class="news_card_pic"><img src="/images/IMG_3836.JPG"></div>
                <div class="news_card_title">Example</div>
                <div class="news_card_text">Matthew pls pleaz pleaze zodo some texts i do not have a clue what to wtire here eh ah eh ah...</div>
                <div class="news_card_link">
                    <a href="#">Read more...</a>
                </div>
            </div>
            <div class="news_card">
                <div class="news_card_pic"><img src="/images/IMG_1531.JPG"></div>
                <div class="news_card_title">Another one</div>
                <div class="news_card_text">Kksj osfsdoihf dsnOIJod josjosad dvkjskjv ksvdjsdlkn jxn ...</div>
                <div class="news_card_link">
                    <a href="#">Read more...</a>
                </div>
            </div>
        </div>
        <div class="more">
            <button class="button">View more</button>
        </div>
    </div>
</section>

<section class="widjet">
    <script src="https://static.elfsight.com/platform/platform.js" data-use-service-core defer></script>
    <div class="elfsight-app-238d66ed-2e77-452c-b96d-ebd4ca9b4079"></div>
</section>
<div class="pic">
</div>
<%@include file="footer.jsp"%>
</body>
</html>

