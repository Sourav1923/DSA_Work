package com.P_LinkList;

public class Main {
    public static void main(String[] args) {
//        SingleLinkedList LL = new SingleLinkedList();
//        LL.insertAtFirst(3);
//        LL.insertAtFirst(4);
//        LL.insertAtFirst(5);
//        LL.insertAtEnd(100);
//        LL.insert(6, 3);
//        LL.display();
//        System.out.println("deleted item is "+LL.delete(4));
//        LL.display();

//        DLL LL = new DLL();
//        LL.insertAtFirst(3);
//        LL.insertAtFirst(4);
//        LL.insertAtFirst(5);
//        LL.insertAtEnd(99);
//        LL.insertAfter(99, 8);
//        LL.display();


        CLL LL = new CLL();

        LL.insert(12);
        LL.insert(10);
        LL.insert(13);
        LL.delete(13);

        LL.display();

    }
}
