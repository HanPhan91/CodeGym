function initgame() {
    selectNobita.src = "nobita.png";
    window.addEventListener('keydown', controlNobita);
}
let selectNobita = document.getElementById('nobita');
initgame();
const left = 37;
const up = 38;
const right = 39;
const down = 40;
let xPosition=0;
let yPosition=0;
const move= 10;
let widthNobita= 188;
let heightNobita= 210;
let widthScreen= window.innerWidth;
let heightScreen= window.innerHeight;
function controlNobita(event) {
    switch (event.keyCode) {
        case 37:
            movetoLeft()
            break;
        case 38:
            movetoUp()
            break;
        case 39:
            movetoRight()
            break;
        case 40:
            movetoDown()
            break;

        default:
            alert("Nhấm phím mũi tên để điều khiển");
            break;
    }
}
function movetoLeft() {
    xPosition= selectNobita.offsetLeft;
    if (xPosition !=0){
        selectNobita.style.left= `${xPosition - move}px`;
    }
}
function movetoRight() {
    xPosition= selectNobita.offsetLeft;
    if ((xPosition+widthNobita) < widthScreen){
        selectNobita.style.left= `${xPosition + move}px`;
    }
}
function movetoUp() {
    yPosition= selectNobita.offsetTop;
    if (yPosition!= 0){
        selectNobita.style.top= `${yPosition - move}px`;
    }
}
function movetoDown() {
    yPosition= selectNobita.offsetTop;
    if ( (yPosition+ heightNobita) < heightScreen){
        selectNobita.style.top= `${yPosition + move}px`;
    }
}