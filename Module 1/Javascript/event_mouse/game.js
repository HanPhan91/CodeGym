function initgame() {
    select_img.src = "ball.png"
}
let widthScreen = window.innerWidth;
yPosition = 0;
widthBall = 100;
let move = 10;
let select_img = document.getElementById('ball');
initgame();

function turnLeft() {
    yPosition = select_img.offsetLeft;
    if (yPosition!=0) {
        select_img.style.left = `${yPosition- move}px`;
    }
}

function turnRight() {
    yPosition = select_img.offsetLeft;
    if ((yPosition + widthBall) < widthScreen) {
        select_img.style.left = `${yPosition+ move}px`;
    }
}