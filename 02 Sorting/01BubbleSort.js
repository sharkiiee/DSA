let arr = [4,5,2,1,7,8,0];

function bubbleSort(arr){
    for(let i=0;i<arr.length -1;i++){
        for(let j=0; j<arr.length-i-1;j++){
              if(arr[j]>arr[j+1]){
                let temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
          }
        }
    }
    return arr;
}

let SortedArr = bubbleSort(arr);
console.log(SortedArr);