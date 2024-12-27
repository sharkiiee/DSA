// Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

// A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
// Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

public class a01count {

    public static void main(String[] args) {
        int n = 1012;
        System.out.println("Number of digits : " + countDividingDigits(n));
    }

    public static int countDividingDigits(int n) {
        int count = 0;
        int originalNumber = n;

        while (n > 0) {
            int digit = n % 10; 
            n = n / 10; 
            if (digit != 0 && originalNumber % digit == 0) {
                count++;
            }
        }

        return count;
    }
}