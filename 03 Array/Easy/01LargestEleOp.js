// write a program to find the largest element from the array.

// Make a pointer of largest and use it to sompare with array values

let arr = [1,4,3,6,7,2];

let largest = 0;

for(let i = 0; i<arr.length; i++){
    if(arr[i]> arr[largest]){
        largest = i;
    }
}

console.log(`The largest element is ${arr[largest]}`);