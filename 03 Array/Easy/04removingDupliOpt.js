// Write a program to remove the duplicates from the sorted array.
// User have to return how many unique elements he have.

// Here we are using two pointer approach

let arr = [1,1,2,2,3,3,3,4];

let i=0;
for(let j=1;j<arr.length;j++){
    if(arr[i]!=arr[j]){
        arr[i+1] = arr[j];
        i++;
    }
}

const totalElements = i + 1;

console.log(`No of unique elements found : ${totalElements}`)