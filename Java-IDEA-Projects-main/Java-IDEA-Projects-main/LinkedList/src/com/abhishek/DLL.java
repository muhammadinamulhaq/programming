package com.abhishek;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null)  head.prev = node;
        head = node;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public void reverseDisplay(){
        Node node = head;
        while(node.next != null){
            node = node.next;
        }
        while(node != null){
            System.out.print(node.val + "->");
            node = node.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);

        node.next = null;

        if(head == null){
            head = node;
            node.prev = null;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
    }

    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int val, int value){
        Node f = find(val);
        if(f == null){
            System.out.println("invalid value");
            return;
        }
        Node node = new Node(value);
        node.next = f.next;
        f.next = node;
        node.prev = f;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void delete(int val){
        Node f = find(val);
        if(f == null){
            System.out.println("Not present in the list");
            return;
        }
        if(f.prev == null){
            head = f.next;
            return;
        }
        f.prev.next = f.next;
        if(f.next != null) f.next.prev = f.prev;

    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
