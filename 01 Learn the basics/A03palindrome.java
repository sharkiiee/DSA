public class A03palindrome {
    static void checkPalindrome(int value){
        int save = value;
        int rem;
        int reversedValue = 0;
        while(value != 0){
            rem = value % 10;
            reversedValue = (reversedValue * 10) + rem;
            value = value / 10;
        }

        if(save == reversedValue){
            System.out.println(save + " is a palindrome no.");
        }
        else{
            System.out.println(save + " is not a palindrome no.");
        }
    }

    public static void main(String[] args) {
    checkPalindrome(1331);
    }
}
