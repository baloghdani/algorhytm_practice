/**
 * Created by danielbalogh on 4/25/17.
 */
public class Stack {


    static int size = 10;
    static int[] stack = new int[size];
    static int top = -1;

//    public Stack(int size, int[] stack, int top) {
//        this.size = size;
//        this.stack = stack;
//        this.top = top;
//    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.peek());
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // 3
        stack.traverse(); // 3 2 1

        stack.pop();

        System.out.println(stack.peek()); //2
        stack.traverse(); // 2 1
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

    }


    static void push(int item){
        if (Stack.isFull()) {
            System.out.println("stack overflow");
        }
        else {
            stack[++top] = item;
        }
    }

    static void pop(){
        if (Stack.isEmpty()) {
            System.out.println("stack underflow");
        }
        else {
            top--;
        }

    }

    static int peek() {
        if (Stack.isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        else {
            return stack[top];
        }

    }

    static void traverse() {
        for (int i = Stack.top; i>=0; i--) {
            System.out.println(stack[i]);
        }

    }

    static boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean isFull() {
        if(top == size-1) {
            return true;
        }
        else {
            return false;
        }
    }
}
