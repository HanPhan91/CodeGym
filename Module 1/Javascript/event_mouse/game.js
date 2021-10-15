function initgame() {
    select_img.src = "ball.png"
}
let widthScreen = window.innerWidth;
yPosition = 0;
widthBall = 100;
let move = 20;
let select_img = document.getElementById('ball');
let rotate=180;
initgame();

function turnLeft() {
    yPosition = select_img.offsetLeft;
    if (yPosition!=0) {
        select_img.style.left = `${yPosition- move}px`;
        // select_img.style.transform= "rotateX(0deg)";
    }
}

function turnRight() {
    select_img.classList.add('run');
    yPosition = select_img.offsetLeft;
    if ((yPosition + widthBall) < widthScreen) {
        select_img.style.left = `${yPosition+ move}px`;
        // select_img.style.animationName= "rotate";
        
        setTimeout(() => {
            select_img.classList.remove('run'); 
        }, 500);
       
    }
}