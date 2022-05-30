package com.pranav;

import org.w3c.dom.Node;

public class LinkedList {
    Node head;  // head of the list

    class Node{
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) {data = d; }
    }
}
