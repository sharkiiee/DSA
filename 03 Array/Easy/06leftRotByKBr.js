// write a program to left shirt the array by k places.
// In this approach we r taking all the elements till d and storing them in the new array

//TimeComplexity - o(d) + o(n-d) + o(d) = o(n+d))

/*NOTES :- Shortning the iterations if the value of d is given to us is greater than array length
    Suppose value of d is 15 and your length of the array is 7
    so,
        7+7+1 = 15
    If i say Value of d is 9 
    so, 
        7+2 = 9
        What's happening is after rotating the 7 times you came back to the original location of the loop from where you started .
        so instead of rotating 15 time or 9 time we can move 1 time or 2 time respectively and this is what we will do here.

        And the formula is d % n
        example if d = 12 and n = 5 
        so
            12 % 5 = 2 which is equal like 5 + 5 + 2  means here we can rotate only 2 times .
            [1,2,3,4,5]
            After rotation
            [4,5,1,2,3]
*/ 

let arr = [1,2,3,4,5]
let temp = [];

let d = 2; //How many places elements have to shift
let n = arr.length;

// In case if the value of d > n
d = d % n;

for(let i=0; i<d; i++){
    arr[i] = temp.push(arr[i]);
}

for(let i = d; i<n; i++){
    arr[i-d] = arr[i];
}

for(let i=n-d; i<n; i++){
    arr[i] = temp[i-(n-d)]
}

console.log(arr);