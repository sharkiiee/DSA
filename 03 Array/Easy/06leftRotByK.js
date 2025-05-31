// Write the program to left rotate the array by D places

// In this aproach we will try not to take any extra memory

// We will rotate the array from the d part on both the side in two steps and in last rotate whole array
// example : d = 3
// [1,2,3,4,5,6] - 1st [3,2,1,4,5,6] - 2nd [3,2,1,6,5,4] - 3rd [4,5,6,1,2,3]

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

// Time Complexity - o(d) + o(n-d) + o(n) = o(2n) as we see time complexity is increased but the space complexity is beed reduced. sc - o(1)

let arr = [1,2,3,4,5,6]

let d = 3;
let n = arr.length

function reverseRange(arr, start, end) {
  while (start < end) {
    // Swap elements
    [arr[start], arr[end]] = [arr[end], arr[start]];
    start++;
    end--;
  }
}

reverseRange(arr, 0,d-1);
reverseRange(arr,d,n-1);
reverseRange(arr,0,n-1);

console.log(arr)