package com.P_LinkList;

public class SingleLinkedList {
    private Node head = null;
    private Node tail = null;

    private int size;
    SingleLinkedList(){
        this.size = 0;
    }


    //Insert At first
    public void insertAtFirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;

        if (tail == null){
            tail = head;
        }

        size++;
     //   System.out.println(size);
    }
    // Insert At End
    public void insertAtEnd(int data){
        Node newnode = new Node(data);
        if(tail==null){
            insertAtFirst(data);
        }
        tail.next = newnode;
        tail = newnode;

        size++;
       // System.out.println(size);
    }

    // Insert At Any Index

    public void insert(int data, int index){
        if (index > size){
            System.out.println("Invalid Index "+index);
            return;
        }


        if (index == 0){
            insertAtFirst(data);
            return;
        } else if (index == size) {
            insertAtEnd(data);
            return;
        }
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newnode = new Node(data, temp.next);
        temp.next = newnode;

        size++;
     //   System.out.println(size);
    }


    // Delete First

    public int deleteFirst (){
        int value = head.data;
        head= head.next;
        if (head == null){
            tail = null;
        }

        size--;

        return value;
    }
// Delete Last
    public int deleteLast (){
        int value = tail.data;

        if (head == tail){
            head = tail = null;
        }

        Node temp = head;
        while (temp.next != tail ){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
       size--;
        return value;
    }

    //Delete Any

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
         temp = temp.next;
        }
        int value = temp.next.data;
        temp.next=temp.next.next;
        size--;
        return value;
    }

    // Insert using Recursion

    public void insertRec(int val, int index){
        head= insertRec(val, index, head);
    }

    private Node insertRec(int val , int index, Node node){
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);

        return node;
    }
    //Reversing LinkedList

    //Using Recursion

    private void reverseUsingRec(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverseUsingRec(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;

    }

    private void reverseUsingIter(){
        if (size < 2){
            return;
        }

        Node prev = null;
        Node pres = head;
        Node fast = head.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = fast;
            if(fast != null){
                fast = fast.next;
            }
        }

        head = prev;
    }

    public void reversal(){
       // reverseUsingRec(head);

        reverseUsingIter();
    }



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

   // Display

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
