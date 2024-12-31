
import java.util.Scanner;

// Greatest Common Factoe and highest common factor
// example of gcf :-
// Factor of 9 = 1,3,9
// Factor of 12 = 1,2,3,4,6,12
// so the gcf of the 9 and 12 is : 3
// The common values are the gcf

public class A07BruGCDandHCF {

    static void findGCD(int value1, int value2)
    {
        for(int i = Math.min(value1, value2); i >= 1; i--){
            if(value1 % i== 0 && value2 % i == 0){
                System.out.println("The Greatest Common factor is : " + i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value");
        int value1 = scanner.nextInt();
        System.out.println("Enter the second Value");
        int value2 = scanner.nextInt();
        scanner.close();
        findGCD(value1, value2);
    }
}
