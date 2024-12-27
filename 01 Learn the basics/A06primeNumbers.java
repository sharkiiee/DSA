
import java.util.Scanner;

// Take the value from the user and check whether the no. is prime or not
// Prime no. that have only two factors 1 and itself.
// NOTE :- 1 is not a prime no.
// Using sqrt method to reduce the no. of iterations

public class A06primeNumbers {

    static boolean checkIfItsPrime(int number){
        int count = 0;
        for (int i = 1; i*i <= number; i++) {
            if(number % i == 0){
                count++;
                if(number/i != i){
                    count++;
                }
            }
        }
        return count < 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check whether the no. is prime or not");
        System.out.println("Enter the value :");
        int value = scanner.nextInt();
        scanner.close();
        boolean isPrimeNo = checkIfItsPrime(value);

        if(isPrimeNo){
            System.out.println(value + " is a prime no.");
        }else{
            System.out.println(value + " is not a prime no.");
        }
    }
}
