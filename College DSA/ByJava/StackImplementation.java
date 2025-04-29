import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int size;

    // Constructor to initialize stack
    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot add element.");
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty! Nothing to remove.");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    // Method to display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
