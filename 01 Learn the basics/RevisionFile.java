//// Write a program to find the gcd of the numbers

import java.util.Scanner;

public class RevisionFile {
    static int findGCD(int num1, int num2){
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if(num1 % i ==0 && num2% i == 0){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Value");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second value");
        int number2 = scanner.nextInt();
        int gcd = findGCD(number1,number2);
        System.out.println(gcd);
    }
}