package com.abhishek;

public class Main {
    public static void main(String[] args) {
        LL list = new LL(0);

        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
//        list.insertLast(6);
//        list.insert(0, 3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88, 2);
        list.display();

//        DLL list = new DLL();
//        list.insertLast(6);
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.display();
//        list.insertAfter(1, 7);
//        list.display();
//        list.delete(6);
//        list.display();

//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.delete(23);
//        list.display();
    }
}
