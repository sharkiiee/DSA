// Write a program for left rotating the array

// Time Complexity :- O(n)
// Space Complexity :- O(n) - Although the array is given to me still i am using the array so the space complexity is O(n) instead of O(1)

let arr = [1,2,3,4,5,6];
let temp = arr[0];
for(let i=1;i< arr.length;i++){
    arr[i-1] = arr[i];
}

arr[arr.length - 1] = temp;

console.log(arr);