// Write a program to reverse the number.

public class a02reverse {
    static int reverseNo(int value){
        int rem = 0;
        int reversedValue = 0;
        while(value != 0){
            rem = value % 10;
            reversedValue = (reversedValue * 10) + rem;
            value = value / 10;
        }
        return reversedValue;
    }

    public static void main(String[] args) {
    int value = reverseNo(3700);
    System.out.println(value);
    }
}

