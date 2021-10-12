let dtb = 5.5;
if (dtb < 0 || dtb > 10)
    console.log('diem ko hop le');
else {
    switch (Math.floor(dtb)) {
        case 5:
            console.log('Trung binh');
            break;
        case 6:
            console.log('TB- Kha');
            break;
        case 7:
            console.log('Kha');
            break;
        case 8:
            console.log('Gioi');
            break;
        case 9:
        case 10:
            console.log('Xuat sac');
            break; 
        default:
            console.log('Yeu');
    }
}