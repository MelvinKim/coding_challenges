package com.company.linkedlists.easy;

public class PrintReverseLinkedList {

    static class Node {
        int val;
        Node next;

        Node() {

        }

        Node(Node theNextNode, int value) {
            next = theNextNode;
            val = value;
        }
    }

    public static void printReverseLinkedList(Node head) {

        //base case
        if(head == null) {
            return;
        }

        printReverseLinkedList(head.next);
        System.out.println(head.val);
    }
}
