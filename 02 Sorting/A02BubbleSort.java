
import java.util.Arrays;

// It pushes the maximum to the last by adjucent swaps

public class A02BubbleSort {

    static int[] sortTheArr(int[] arr){
        for (int i = arr.length-1; i >= 1; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int[] sortedArr = sortTheArr(arr);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }
}
