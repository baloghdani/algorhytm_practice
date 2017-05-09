package test.java.LinkedListRemoveNode;

/**
 * Created by danielbalogh on 5/8/17.
 */
public class MyLinkedList {

    ListNode startNode;

    public void add(int value) {
        if (startNode == null) {
            startNode = new ListNode(value);
        } else {
            ListNode current = startNode;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void printAll() {
        ListNode current = startNode;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public ListNode remove(int value) {
        ListNode current = startNode;
        while (current.next.data != value) {
            current = current.next;
            if (current.next == null) {
                System.out.println("This Linked List doesn't contain this item: " + value);
                return null;
            }
        }
        ListNode removed = current.next;
        current.next = current.next.next;
        System.out.println("This item removed from the Linked List: " + removed.data);
        return removed;
    }

    public ListNode search(int value) {
        ListNode current = startNode;
        while (current.data != value) {
            current = current.next;
            if (current == null) {
                System.out.println("This Linked List doesn't contain this item: " + value);
                return null;
            }
        }
        System.out.println("This Linked List contain this item: " + current.data);
        return current;
    }

    public void insert(int prev, int insertable) {
        ListNode current = startNode;
        while (current.data != prev) {
            current = current.next;
            if (current == null) {
                System.out.println("This Linked List doesn't contain this item: " + prev);
                return;
            }
        }
        ListNode temp = current.next;
        current.next = new ListNode(insertable);
        current.next.next = temp;
        System.out.println(current.next.data + " inserted between " + current.data + " and " + temp.data);
    }
}