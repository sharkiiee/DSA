let arr = [3,4,5,2,2,1,0,5,6];

let smallest = Number.MAX_SAFE_INTEGER;
let secondS = Number.MAX_SAFE_INTEGER;

for(let i=0; i<arr.length; i++){
    if(arr[i]<smallest){
        secondS = smallest;
        smallest = arr[i];
    }else if(arr[i]<secondS && arr[i]>smallest){
        secondS = arr[i];
    }
}

console.log(`Smallest = ${smallest}
Second Smallest = ${secondS}`)