package com.abhishek.Polymorphism;

public class Numbers {
    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(2, 3, 4));
    }

    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}
