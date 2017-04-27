package datastructures;
/**
 * Created by danielbalogh on 4/23/17.
 */
public class QueueWithArray {

    private int first = -1;
    private int last = -1;
    private int[] arr = new int[10];

    public boolean isEmpty() {
        return first == last;
    }

    public boolean isFull() {
        return (last == arr.length -1);
    }

    public void enqueue(int item) {
        if (this.isFull()) {
            System.out.println("the queue is full!");
        }
        else {
            last++;
            arr[last] = item;
        }
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("the queue is empty");
            return -1;
        }
        else{
            first++;
            return arr[first];
        }
    }

    public void displayAll() {
        if (this.isEmpty()) {
            System.out.println("the queue is empty");
        }
        else {
            System.out.println("the items in the queue: ");
            for (int i = last; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        QueueWithArray queue = new QueueWithArray();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);

        queue.displayAll();

        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        System.out.println(queue.dequeue());
        queue.dequeue();

        queue.displayAll();

    }
}
