package com.abhishek.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();
        Daughter daughter = new Daughter(21);
        daughter.career();

        // abstract classes can't be instantiated
//        Parent mom = new Parent(24);
        Parent.hello();
    }
}
