package com.abhishek.interfaces.extendDemo2;

public class Main implements A, B {

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }


    @Override
    public void greet() {

    }
}
