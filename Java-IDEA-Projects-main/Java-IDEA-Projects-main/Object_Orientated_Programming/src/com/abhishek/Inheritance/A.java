package com.abhishek.Inheritance;

public class A {
    public int n = 4;
    int c = 1;
    private int check = 1;

    public A(int n, int c, int check) {
        this.n = n;
        this.c = c;
        this.check = check;
    }

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }

    int area(){
        return 2;
    }

}
