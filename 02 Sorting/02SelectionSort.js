let arr = [4,5,2,1,7,8,0];

function selectionSort(arr){
    for(let i=0;i<arr.length -1;i++){
        let minIndex = i;
        for(let j=i+1 ; j<arr.length;j++){
            if(arr[minIndex] > arr[j]){
                minIndex = j
            }
          }
                let temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
        }
        return arr;
    }


let SortedArr = selectionSort(arr);
console.log(SortedArr);