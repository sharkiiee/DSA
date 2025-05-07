// Program for the armstrong number's.

const value = 153;
let save = value;

let valueLength = 0

while(save != 0){
    valueLength++;
    save = parseInt(save / 10);
}

save = value;
let result = 0;

while(save!=0){
    let rem = save % 10;
    result = result + Math.pow(rem,valueLength);
    save = parseInt(save / 10);
}


// Another easy way to write the same code  

// const numStr = number.toString();
//     const power = numStr.length;
//     let sum = 0;

//     for (let digit of numStr) {
//         sum += Math.pow(parseInt(digit), power);
//     }

if(result == value){
    console.log("This is an armstrong number");
}else{
    console.log("This is not an armstrong number")
}