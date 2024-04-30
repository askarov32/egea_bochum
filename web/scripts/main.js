document.addEventListener("DOMContentLoaded", function () {
    const elem = document.querySelector(".back_logo>img");;
        document.addEventListener('scroll', () => {
            elem.style.right = -0.1*window.innerWidth + (0.1 * window.pageYOffset) + 'px';
        })
});

document.addEventListener("DOMContentLoaded", function () {
    const elem = document.querySelector(".info_1");
    document.addEventListener('scroll', () => {
        elem.style.bottom = -40 + (0.1 * window.pageYOffset) + 'px';
    })
});



document.addEventListener("DOMContentLoaded", function () {
    const title = document.querySelector(".form_title");
    const text = document.querySelector(".form_text");
    document.addEventListener('scroll', () => {
            if (window.pageYOffset > 1500){
                title.classList.add('animation_title');
                text.classList.add('animation_text');
            };
            if (window.pageYOffset < 1500){
                title.classList.remove('animation_title');
                text.classList.remove('animation_text');
            };
            if (window.pageYOffset > 2700){
                title.classList.remove('animation_title');
                text.classList.remove('animation_text');
            };
    });

});