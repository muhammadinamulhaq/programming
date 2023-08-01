package com.abhishek.interfaces.nested;

public class A {
    // nested interface can be public, private, protected
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}