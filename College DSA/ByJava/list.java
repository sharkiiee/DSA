import java.util.Arrays;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        int var[] = new int[5];
        System.out.println("Enter the index within the 0-4");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println("Enter the value");
        int value = scanner.nextInt();
        var[index] = value;
        System.out.println(Arrays.toString(var));
    }
}
