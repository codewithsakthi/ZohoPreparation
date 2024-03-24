package com.List.linkedlist;

public class DoubleLinkedList {
    int size;
    Node head;
    Node tail;
    public DoubleLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value){
    Node node = new Node(value,null,head);
    head =node;
    size++;
    if(tail==null){
        tail=head;
      }
    }
    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
