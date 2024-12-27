// Write a program to check whether the no. is armstrong or not.
// The sum of cube of all the digit is equal to number then the no. is armstrong no.

public class A04armstrong {

    static int countDigits(int value){
        int digits = 0;
        while(value > 0){
            digits++;
            value = value / 10;
        }
        return digits;
    }

    static boolean isArmstrong(int value){
        int dup = value;
        int sum = 0;
        int rem;

        int digits = countDigits(value);

        while(dup > 0){
            rem = (dup % 10);
            sum = sum + (int)Math.pow(rem, digits);
            dup = dup / 10;
        }
        return sum==value;
    }
    public static void main(String[] args) {
        boolean checkValue = isArmstrong(8208);
        if(checkValue){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an armstrong");
        }
    }
}
