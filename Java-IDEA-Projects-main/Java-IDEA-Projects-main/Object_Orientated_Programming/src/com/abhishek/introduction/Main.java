package com.abhishek.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        Student student = new Student();

        student.marks = 100;
        student.name = "Abhishek";
        student.rollNo = 413;

        System.out.println(student);

        final int bonus = 3;
//        bonus = 4;

        final A abhi = new A("Abhishek");
        abhi.name = "Abhishek Chandra";

        // can't do something like this
//        abhi = new A("other name");
        A obj;

        for (int i = 0; i < 1000000; i++) {
            obj = new A("random name");
        }
    }
}

class Student{
    public int rollNo;
    public String name;
    public int marks;
}

class A{
    final int num = 4;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}