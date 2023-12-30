package com.samplejava.springboot.algorithms;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        head.next = head1;
        ListNode head2= new ListNode(3);
        head1.next = head2;
        ListNode head3= new ListNode(3);
        head2.next = head3;

        System.out.println("Original Linked List:");
        printList(head);

        ListNode reversedList = reverseList(head);

        System.out.println("\nReversed Linked List:");
        printList(reversedList);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

//        1, {
//           5,  6
//             { 7 {
//               null
//             }
//           }
//        }
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}