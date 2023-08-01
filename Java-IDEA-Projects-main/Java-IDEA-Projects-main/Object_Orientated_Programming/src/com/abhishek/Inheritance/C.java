package com.abhishek.Inheritance;

public class C extends A{
    int n = 10;
    int c = 45;

    public C(int n, int c, int check, int n1, int c1) {
        super(n, c, check);
        this.n = n1;
        this.c = c1;
    }

    int area(){
        return 1;
    }
}
