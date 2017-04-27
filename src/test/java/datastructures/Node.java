package datastructures;
/**
 * Created by danielbalogh on 4/26/17.
 */
public class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public void displayNode(){
        System.out.print(data+ " ");
    }

}
