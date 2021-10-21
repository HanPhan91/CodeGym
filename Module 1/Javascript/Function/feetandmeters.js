function footToMeter(foot){
    return 0.305 * foot;
}
function meterToFoot(meter){
    return 3.279 * meter;
}
function main(){
    let foot= 35;
    let met= 14;
    console.log(`${foot} Foot đổi sang Meter bằng: ${footToMeter(foot)}`);
    console.log(`${met} Meters đổi sang Meter bằng: ${meterToFoot(met)}`);
}
main();
