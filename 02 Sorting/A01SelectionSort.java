// Selection Sort
// Time Complexity :- O(n*n)
import java.util.Arrays;
import java.util.Scanner;

public class A01SelectionSort {

    static int[] sortTheArr(int[] arr){
        for (int i = 0; i <= arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of the array :");
        int range = scanner.nextInt();
        int[] arr = new int[range];

        for (int i = 0; i < range; i++) {
            System.out.printf("Enter the value for index [%d]\n",i);
            arr[i] = scanner.nextInt();
        }

        scanner.close();
        System.out.println(Arrays.toString(sortTheArr(arr)));
    }
}
