<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <title></title>
    <style>
        .footer{
            margin:0;
            background-color: #3e3e3e;
        }
        .footer_item img{
            width:80px;
            height: 40px;
        }
        .footer_container{
            display: flex;
            flex-direction: column;
            align-content: center;
            align-content: center;
            justify-content: center;
            padding: 40px 13% 40px 13%;
        }
        .first_part{
            display: flex;
            flex-direction: row;
        }
        .footer_item{
            display: flex;
            flex-direction: column;
            margin-right: 80px;
        }
        .footer_item_title{
            margin-bottom: 20px;
            font-size: 24px;
            color: white;
            font-family: 'Josefin';
        }
        .footer_item_item{
            margin-bottom: 8px;
            color: #FFBC5C;
        }
        .footer_item_item a{
            color: #ffbc5c;
        }
        .icons img{
            margin-top: 2px;
            height: 30px;
            width: auto;
            margin-right: 10px;
        }
        .icons{
            display: flex;
        }
        @media only screen and (max-width:1000px) {
            .back_logo img {
                top: 550px;
            }

            .first_part {
                flex-direction: column;
            }

            .footer_item_title {
                margin-bottom: 8px;
            }

            .footer_item {
                margin: 24px;
            }
        }
    </style>
</head>
<footer class="footer">
    <div class="footer_container">
        <div class="first_part">
            <div class="footer_item">
                <img src="/images/footer_logo.png"/>
            </div>
            <div class="footer_item">
                <div class="footer_item_title">Information</div>
                <div class="footer_item_item">
                    <a href="/main">Home</a>
                </div>
                <div class="footer_item_item"><a href="/news">News</a></div>
                <div class="footer_item_item"><a href="/events">Events</a></div>
                <div class="footer_item_item"><a href="/about-us">About us</a></div>
            </div>
            <div class="footer_item">
                <div class="footer_item_title">Contact</div>
                <div class="footer_item_item">
                    <div class="icons">
                        <img src="/images/inst.png"/>
                        <imf src="/images/Mail.png"/>
                    </div>
                </div>
                <div class="footer_item_item">8-800-555-35-35</div>
                <div class="footer_item_item">Laerheidestrasse, 34 44799, Bochum</div>
            </div>
        </div>
        <div class="second_part"></div>
    </div>
</footer>
