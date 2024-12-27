// Greatest Common Divisor and highest common factor
// example of gcd :-
// Factor of 9 = 1,3,9
// Factor of 12 = 1,2,3,4,6,12
// so the gcd of the 9 and 12 is : 3
// The common values are the gcd

//Euclidean Algorithm
// It states that gcd(a,b) = gcd(a-b,b) , where a>b


import java.util.Scanner;

public class A07GCDandHCF {

    static int findGCD(int number1,int number2){
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the Greatest common factor between two numbers");
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        int gcd = findGCD(number1,number2);
        System.out.println("The greatest common factor of "+ number1 +" and " +number2 +" is "+ gcd);
    }   
}
