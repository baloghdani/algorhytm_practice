package datastructures;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by danielbalogh on 4/23/17.
 */
public class Stack {

    static Scanner sc = new Scanner(in);
    static int stack[], top = -1, size;

    public static void main(String args[]) {

        int choice, item;

        Stack.create();

        while (true) {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Traverse");
            System.out.println("5.Quit");

            System.out.print("Enter your choice");
            choice = sc.nextInt();

            switch(choice) {
                case 1: System.out.println("Enter element: ");
                    item = sc.nextInt();
                    Stack.push(item);
                    break;
                case 2: item = Stack.pop();
                    if (item == 0) {
                        System.out.println("Stack underflow");
                    }
                    else {
                        System.out.println("popped item: "+item);
                    }
                    break;
                case 3: item = Stack.peek();
                    if (item == 0) {
                        System.out.println("Stack underflow");
                    }
                    else {
                        System.out.println("peek item: "+item);
                    }
                    break;
                case 4: Stack.traverse();
                    break;
                case 5: System.exit(1);
                default:
                    System.out.println("invalid choice");
            }
        }

    }

    static void create() {
        System.out.println("Enter the size of the stack: ");
        size = Stack.sc.nextInt();
        Stack.stack = new int[size];
        System.out.println("Stack created with size: "+size);
    }

    static void push(int item) {
        if (Stack.isFull()) {
            System.out.println("Stack overflow");
        }
        else {
            stack[++top] = item;
        }
    }

    static boolean isFull() {
        if (top == size-1) {
            return true;
        }
        else {
            return false;
        }
    }

    static int pop() {
        if (Stack.isEmpty()) {
            return 0;
        }
        else {
            return stack[top--];
        }
    }

    static int peek() {
        if (Stack.isEmpty()) {
            return 0;
        }
        else {
            return stack[top];
        }
    }

    static boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    static void traverse() {
        if (Stack.isEmpty()) {
            System.out.println("stack is empty!");
        }
        else {
            System.out.println("Elements of stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }


}
