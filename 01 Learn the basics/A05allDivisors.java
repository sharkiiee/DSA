// Important
//Find all the divisors of the no.
// This is the most optimized solution using sqrt
// Time Complexity is  O(sqrt(n))

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A05allDivisors {
    static void findDivisors(int value){
        int midValue = (int) Math.sqrt(value);
        ArrayList<Integer> divValues = new ArrayList<>();
        for (int i = 1; i <= midValue; i++) {
            if(value % i == 0){
                divValues.add(i);
                if(value / i != i)
                divValues.add(value / i);
            }
        }

        Collections.sort(divValues);

        System.out.println(divValues);
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to find its divisors : ");
        int value = scanner.nextInt();
        scanner.close();  
        
        findDivisors(value);
    }
}
