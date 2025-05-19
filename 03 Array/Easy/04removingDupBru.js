// A Set in JavaScript is a built-in object that lets you store unique values of any type—primitive values or object references.

const arr = [1, 1, 2, 2, 3, 3, 4];

const uniqueArr = [...new Set(arr)];

console.log("After removing duplicates:", uniqueArr);
