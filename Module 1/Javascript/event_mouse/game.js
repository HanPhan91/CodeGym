function initgame() {
    select_img.src = "ball.png"
}
let widthScreen = window.innerWidth;
yPosition = 0;
widthBall = 100;
let move = 20;
let select_img = document.getElementById('ball');
let rotate = 180;
initgame();

function turnLeft() {
    select_img.classList.add('run_left');
    yPosition = select_img.offsetLeft;
    if (yPosition != 0) {
        select_img.style.left = `${yPosition- move}px`;
        setTimeout(() => {
            select_img.classList.remove('run_left');
        }, 500);
    }
}

function turnRight() {
    select_img.classList.add('run_right');
    yPosition = select_img.offsetLeft;
    if ((yPosition + widthBall) < widthScreen) {
        select_img.style.left = `${yPosition+ move}px`;
        setTimeout(() => {
            select_img.classList.remove('run_right');
        }, 500);

    }
}