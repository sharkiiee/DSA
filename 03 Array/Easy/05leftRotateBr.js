// Left shift an array by one place

// Here we are actually taking a new array and storing values in it.

let arr = [1,2,3,4,5,6,7];
let newArr = [];

for(let i=1;i<arr.length;i++){
    newArr.push(arr[i]);
}
newArr.push(arr[0]);
console.log(newArr);