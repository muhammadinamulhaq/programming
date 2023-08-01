package com.abhishek.basic;

public class Main {
    public static void main(String[] args) {
        message(5);
    }

    static void message(int i){
        if(i == 1) {
            return;
        }
        message(--i);
        System.out.println("Hello World");
    }
}
