package com.abhishek.access;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Abhishek Chandra");
        int n = obj.num;

//        System.out.println(obj instanceof Object);
    }
}
