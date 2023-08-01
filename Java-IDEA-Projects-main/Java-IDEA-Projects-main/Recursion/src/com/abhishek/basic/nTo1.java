package com.abhishek.basic;

public class nTo1 {
    public static void main(String[] args) {
        System.out.println(nToOne(5));
    }

    static int nToOne(int n){
        if(n == 1){
            return 1;
        }
        System.out.println(n);
        return nToOne(n - 1);
    }
}
