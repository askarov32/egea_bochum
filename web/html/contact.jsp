<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Contact us - EGEA Bochum</title>
        <link rel="stylesheet" href="/styles/contact.css">
    </head>
    <body>
        <header class="header">
            <div class="container">
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

        <section class="main">
            <div class="main_container">
                <div class="big_title">Contact us</div>
                <div class="small_title">EGEA Team</div>
                <div class="info_block">
                    <div class="smaller_title">Please send us your questions, comments or requests regarding:                    </div>
                    <ul class="list">
                        <li>EGEA in general</li>
                        <li>Possible cooperation or partnership</li>
                        <li>Topics you would like us to discuss in our meetings</li>
                        <li>Specific responsibilities of all Board Members</li>
                    </ul>
                    <div class="contacts_block">
                        <div class="bruh">
                            <div class="cp">
                                <div class="name">Matthew Becker - CP1</div>
                                <div class="number">+49 813738 89712489 </div>
                                <div class="email">jadakbbfa.knavskv@gmail.com</div>
                            </div>
                            <div class="cp">
                                <div class="name">Moritz Helmecke - CP2</div>
                                <div class="number">+49 882338 82872489 </div>
                                <div class="email">jadiaha.kndkv@gmail.com</div>
                            </div>
                        </div>
                        <div class="cp">
                            <div class="name">Adress</div>
                            <div class="number">Knfksnkfn 32, 938587, Bochum, Germany</div>
                        </div>
                    </div>
                </div>
                <div class="website_block">
                    <div class="website_block_title">Any suggestions or questions regarding website?</div>
                    <div class="website_block_email">jadiaha.kndkv@gmail.com</div>
                </div>
            </div>
        </section>
        <div class="pic">
        </div>
        <footer class="footer">
            <div class="footer_container">
                <div class="first_part">
                    <div class="footer_item">
                        <img src="../images/footer_logo.png"/>
                    </div>
                    <div class="footer_item">
                        <div class="footer_item_title">Information</div>
                        <div class="footer_item_item">
                            <a href="/html/main.jsp">Home</a>
                        </div>
                        <div class="footer_item_item"><a href="/html/news.jsp">News</a></div>
                        <div class="footer_item_item"><a href="#">Events</a></div>
                        <div class="footer_item_item"><a href="#">About us</a></div>
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
    </body>
</html>
