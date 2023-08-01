package com.abhishek.abstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    // we can't create an abstract constructor
//    abstract Parent();

    static void hello(){
        System.out.println("Hello");
    }

    public void greeting(){
        System.out.println("Greetings");
    }

    abstract void career();
    abstract void partner();
}
