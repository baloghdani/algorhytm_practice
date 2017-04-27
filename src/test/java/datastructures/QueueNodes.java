package datastructures;
/**
 * Created by danielbalogh on 4/26/17.
 */
public class QueueNodes {

    private Node first = null;
    private Node last = null;

    public void displayAll() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void enqueue(int item) {
        Node node = new Node(item);
        if (isEmpty()) {
            node.next = first;
            first = node;
            last = node;
        }
        else {
            last.next = node;
            last = node;
            last.next = null;
        }
    }

    public int dequeue() {
        Node node = first;
        first = first.next;
        return node.data;
    }


    public static void main(String[] args) {

        QueueNodes queue = new QueueNodes();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.displayAll(); // 1 2 3 4
        System.out.println("popped item: " + queue.dequeue());
        queue.displayAll(); // 2 3 4

    }



}