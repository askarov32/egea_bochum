<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title></title>
<style>

    @font-face {
        font-family: 'Inter';
        src: url("/fonts/Inter-Regular.ttf");
    }
    @font-face {
        font-family: 'Josefin';
        src: url("/fonts/JosefinSans-Regular.ttf");
    }
    @font-face {
        font-family: 'JosefinLight';
        src: url("/fonts/JosefinSans-Light.ttf");
    }
    @font-face {
        font-family: 'InterSemibold';
        src: url("/fonts/Inter-SemiBold.ttf");
    }
    .header{
        padding: 0px 70px 0 70px;
        background-color: rgb(255, 255, 255);
    }
    .container1{
        display: flex;
        align-items: center;
        align-content: center;
        justify-content: space-between;
    }
    .menu{
        list-style: none;
        display: flex;
        flex-direction: row;
        justify-content: center;
        align-items: center;
        padding: 0%;
        margin: 0%;
    }
    .menu li{
        margin: 24px;
    }
    .logo img{
        size: 100px 52px;
        margin: 0%;
        padding: 0%;
    }
    .menu a{
        color: #FF9600;
        font-family: 'Inter';
        font-size: 18px;
        word-break: keep-all;
    }
    .menu a:hover{
        border-bottom: #FF9600 solid 2px;
    }
    .button{
        box-sizing: border-box;
        background-color: #FFBC5C;
        color: white;
        align-items: center;
        align-content: center;
        padding: 8px 32px;
        font-size: 18px;
        border-radius: 5px;
        border: none;
        overflow: hidden;
        margin: 0%;
    }
    .button:hover{
        cursor: pointer;
        background-color: #ffd396;
        transition: 1.5s;
    }
    .logo:hover{
        cursor: pointer;
    }
    .hidden_login{
        display: none;
    }
    .nav{
        padding: 0%;
        margin: 0%;
        overflow: inherit;
        align-self: center;
    }
    .burger{
        display: none;
        z-index: 1;
    }
    .bar{
        display: block;
        width: 30px;
        height: 3px;
        margin: 5px auto;
        transition: 0.3s;
        background-color: #ff9500;
        opacity: 90%;
        border-radius: 4px;
    }
    @media only screen and (max-width:1000px) {
        .nav{
            background-color: rgb(255, 255, 255, 0.8);
            position: absolute;
            top:0px;
            right: -200px;
            transition: 1s;
            padding:90px 45px 40px 45px;

        }
        .menu{
            position: relative;
            flex-direction: column;
            transition: 0.3s;
            align-content: center;

        }
        .hidden_login{
            display: flex;
        }
        .login{
            display: none;
        }
        .burger{
            display: block;
            cursor: pointer;
        }
        .menu li{
            margin: 1rem 0;
        }
        .menu a{
            font-family: 'InterSemibold';
        }
        .nav.active{
            right: 0px;
            transition: 1s;
        }
        .burger.active .bar:nth-child(2){
            opacity: 0;
        }
        .burger.active .bar:nth-child(1){
            transform: translateY(8px) rotate(45deg);
        }
        .burger.active .bar:nth-child(3){
            transform: translateY(-8px) rotate(-45deg);
        }
    }
</style>
</head>
<body>
<header class="header">
    <div class="container1">
        <div class="logo">
            <a href="/html/main.jsp"><img src="/images/Logo1.png" alt="logo"/></a>
        </div>
        <div class="burger" onclick="document.querySelector('.nav').classList.toggle('active'); document.querySelector('.burger').classList.toggle('active'); ">
            <span class="bar"></span>
            <span class="bar"></span>
            <span class="bar"></span>
        </div>
        <nav class="nav">
            <ul class="menu">
                <li><a href="/main">Home</a></li>
                <li><a href="/news">News</a> </li>
                <li><a href="/events">Events</a></li>
                <li><a href="/about-us">About us</a></li>
                <li><a href="/contact">Contact</a></li>
                <li class="hidden_login"><a href="/login">Log in</a></li>
            </ul>
        </nav>
        <div class="login">
            <button class="button" onclick="redirectToPage()">Log in</button>
        </div>

        <script>
            function redirectToPage() {
                window.location.href = '/login';
            }
        </script>
    </div>
</header>
</body>
</html>
