package com.abhishek.Inheritance;

import com.abhishek.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Abhishek Chandra");
        int n = obj.num;
    }
}
