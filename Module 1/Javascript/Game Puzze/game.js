function initGame() {
    let block1 = document.getElementById('block1');
    let block2 = document.getElementById('block2');
    let block3 = document.getElementById('block3');
    let block4 = document.getElementById('block4');
    let block5 = document.getElementById('block5');
    let random_Num = Math.floor(Math.random() * 3 + 1);
    block1.src = `img/image${bl1}-1.png`;
    block2.src = `img/image${bl2}-2.png`;
    block3.src = `img/image${bl3}-3.png`;
    block4.src = `img/image${bl4}-4.png`;
    block5.src = `img/image${bl5}-5.png`;
}

var bl1 = Math.floor(Math.random() * 3 + 1);
var bl2 = Math.floor(Math.random() * 3 + 1);
var bl3 = Math.floor(Math.random() * 3 + 1);
var bl4 = Math.floor(Math.random() * 3 + 1);
var bl5 = Math.floor(Math.random() * 3 + 1);
initGame();

function change_block1() {
    if (bl1 == 3)
        bl1 = 1;
    else
        bl1 += 1;
    block1.src = `img/image${bl1}-1.png`;
    if (bl1 == bl2 && bl1 == bl3 && bl1 == bl4 && bl1 == bl5)
        document.getElementById('play').style.backgroundColor = "green";
    else
        document.getElementById('play').style.backgroundColor = "red";
}

function change_block2() {
    if (bl2 == 3)
        bl2 = 1;
    else
        bl2 += 1;
    block2.src = `img/image${bl2}-2.png`;
    if (bl1 == bl2 && bl1 == bl3 && bl1 == bl4 && bl1 == bl5)
        document.getElementById('play').style.backgroundColor = "green";
    else
        document.getElementById('play').style.backgroundColor = "red";
}

function change_block3() {
    if (bl3 == 3)
        bl3 = 1;
    else
        bl3 += 1;
    block3.src = `img/image${bl3}-3.png`;
    if (bl1 == bl2 && bl1 == bl3 && bl1 == bl4 && bl1 == bl5)
        document.getElementById('play').style.backgroundColor = "green";
    else
        document.getElementById('play').style.backgroundColor = "red";
}

function change_block4() {
    if (bl4 == 3)
        bl4 = 1;
    else
        bl4 += 1;
    block4.src = `img/image${bl4}-4.png`;
    if (bl1 == bl2 && bl1 == bl3 && bl1 == bl4 && bl1 == bl5)
        document.getElementById('play').style.backgroundColor = "green";
    else
        document.getElementById('play').style.backgroundColor = "red";

}

function change_block5() {
    if (bl5 == 3)
        bl5 = 1;
    else
        bl5 += 1;
    block5.src = `img/image${bl5}-5.png`;
    if (bl1 == bl2 && bl1 == bl3 && bl1 == bl4 && bl1 == bl5)
        document.getElementById('play').style.backgroundColor = "green";
    else
        document.getElementById('play').style.backgroundColor = "red";

}