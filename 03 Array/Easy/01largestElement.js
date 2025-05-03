let arr = [3,2,4,6,7,8,8,3,4];
let largest = arr[0];
let secondL = -1;

for(let i=0; i<arr.length; i++){
    if(arr[i]>largest){
        secondL = largest;
        largest = arr[i];
    }
    else if(arr[i]>secondL && arr[i]<largest){
        secondL = arr[i];
    }
}

console.log("Largest = " + largest);
console.log("Second Largest = "+ secondL);