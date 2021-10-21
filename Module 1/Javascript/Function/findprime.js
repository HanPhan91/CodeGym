function isPrime(number){
    for(let i=2; i<number; i++){
        if(number%i ==0){
            return false;
        }
        else{
            return true;
        }
    }
}
function main(){
    let check= isPrime(6);
    if (check){
        console.log(`Là số nguyên tố`);
    }
    else{
        console.log(`Không phải số nguyên tố`);
    }
}
main();