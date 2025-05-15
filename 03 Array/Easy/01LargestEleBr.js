// Finding the largest element from the array
// Using the brute force method for solving

// - At the first sort the array
// - Console the last element of the array

// Time complexity - O(NlogN)
// SC - O(1)

let arr= [1,4,3,6,7,2];

for(let i=0; i<arr.length -1;i++){
    for(let j=0;j<arr.length -i -1;j++){
        if(arr[j]>arr[j+1]){
            let temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}

let lastIndex = arr.length;
console.log(arr[lastIndex - 1]);