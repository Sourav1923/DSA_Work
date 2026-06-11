package com.P_LinkList;

public class CLL {
    private Node head;
    private Node tail;

    //Insert after tail (Append)

    public void insert(int value){
        Node newnode = new Node(value);

        if (head == null){
            head = tail = newnode;
        }

        newnode.next = head;
        tail.next = newnode;
        tail = newnode;
    }

    // Delete

    public void delete(int value){
        if(head == null){
            System.out.println("No list");
            return;
        }
        Node node = head;
        if(node.data == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.data == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);


    }

    //Display

    public void display(){
        Node temp = head;
        System.out.print("HEAD->");
        do {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }while (temp != head);

        System.out.println("HEAD");
    }


    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

}
