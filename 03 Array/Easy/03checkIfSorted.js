// Write a program to check if the array is sorted.

// Time complexity : O(n)

let arr = [1,2,2,3,3,4];

function sortChecker(){
    for(let i=0; i<arr.length-1;i++){
    if(arr[i]<arr[i+1] || arr[i]==arr[i+1]){
        
    }else{
        return false;
    }
}
return true;
}

if(sortChecker()){
    console.log("Array is sorted");
}else{
    console.log("Array is not sorted")
}