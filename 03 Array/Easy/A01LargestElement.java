// The Brute force method 
// to find the largest element of the array first sort the array.
//After you sort the array take the last element of the array and print it.
// Time complexity :- O(NlogN)

// Better Solution is using Bubble sort. - By the first iteration we find the largest element.

public class A01LargestElement {
    public static void main(String[] args) {
        int[] numbers = {10,20,60,40,50};
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
