
import java.util.Scanner;

// Removing duplicates from the array using two pointer approach.

public class A02RemovingDuplicates {
    static int duplicateRemover(){
        int values = 0;
        return values;
    }

    static void valueInserter(int[] arr){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++){
            System.out.printf("Enter the value for index %d\n",i);
            int value = scanner.nextInt();
            arr[i] = value;
        }
    }
    public static void main(String[] args) {
        int[] numbers = new int[5]; 
        valueInserter(numbers);
        
        int totalValues = duplicateRemover(numbers);
    }
}