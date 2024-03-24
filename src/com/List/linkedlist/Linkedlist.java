package com.List.linkedlist;

public class Linkedlist {

    private Node head;
    private Node tail;
    private int size;

    public Linkedlist() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value,head);
        head =node;
        size++;
        if(tail==null){
            tail=head;
        }
    }

    public void insertLast(int value){
        if(tail==null) {
            insertFirst(value);
            return;
        }
            Node node = new Node(value,null);
            tail.next=node;
            tail=node;
            size++;


    }

    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp=temp.next;
        }
    }
    public class Node{
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
