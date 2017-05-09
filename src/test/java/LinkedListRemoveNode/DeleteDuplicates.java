package test.java.LinkedListRemoveNode;

import java.util.Arrays;

/**
 * Created by danielbalogh on 5/8/17.
 */

//Given a sorted linked list, delete all duplicates such that each element appear only once.

public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode p = head.next;

        while(p != null){
            if(p.data == prev.data){
                prev.next = p.next;
                p = p.next;

            }else{
                prev = p;
                p = p.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        MyLinkedList testList = new MyLinkedList();
        testList.add(1);
        testList.add(2);
        testList.add(2);
        testList.add(3);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        testList.add(6);
        testList.add(6);

        testList.printAll();

        DeleteDuplicates delete = new DeleteDuplicates();
        System.out.println(delete.deleteDuplicates(testList.startNode));
    }
}
