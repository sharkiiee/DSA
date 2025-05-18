const arr = [10, 25, 35, 50, 30, 50];
let smallest = arr[0];
let secondSmallest = Number.MAX_VALUE;

for(let i=1; i<arr.length ;i++){
    if(arr[i]<smallest){
        smallest = arr[i];
    }
}

for(let i=0; i<arr.length ;i++){
    if(arr[i]<secondSmallest && arr[i]!=smallest){
        smallest = arr[i];
    }
}

if(secondSmallest == Number.MAX_VALUE){
    console.log("No second smallest number is present");
}else{
    console.log(`Second Smallest : ${secondSmallest}`)
}