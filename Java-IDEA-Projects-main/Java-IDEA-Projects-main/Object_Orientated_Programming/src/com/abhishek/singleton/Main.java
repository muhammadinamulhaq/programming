package com.abhishek.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();

        // if we call it again, the same instance will be returned every time
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all three reference variables are pointing to same objects

    }
}
