package com.P_LinkList;

public class DLL {

    Node head;
    int size;

    public DLL() {
        size++;
    }

    // Insert At first
    public void insertAtFirst(int value){
        Node newnode = new Node(value);
        newnode.next = head;
        newnode.prev = null;

        if(head != null){
            head.prev = newnode;
        }

        head = newnode;
        size++;
    }

    // Insert at the end
    public void insertAtEnd(int value){
        Node newnode = new Node(value);
        newnode.next=null;
        if(head == null){
            head = newnode;
            newnode.prev = null;
            return;
        }

        Node last = head;
        while (last.next != null){
            last=last.next;
        }
        newnode.prev = last;
        last.next = newnode;
         size++;
    }

    //Insert After a Node
    //Find
    public Node find (int target){
       Node temp = head;
        while(temp!= null){
            if(temp.data == target){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public void insertAfter(int after, int value){
        Node p = find(after);

        if (p == null){
            System.out.println("Invalid Input");
        }

        Node  newnode = new Node(value);

        newnode.next = p.next;
        p.next = newnode;
        newnode.prev = p;
        if (newnode.next != null){
            newnode.next.prev = newnode;
        }

        size++;
    }

    public void display(){
        Node temp = head;
        Node last = null;

        while (temp != null){
            System.out.print(temp.data+"->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in Rev");

        while (last != null){
            System.out.print(last.data+"->");
            last = last.prev;
        }
        System.out.println("START");
    }

    class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
