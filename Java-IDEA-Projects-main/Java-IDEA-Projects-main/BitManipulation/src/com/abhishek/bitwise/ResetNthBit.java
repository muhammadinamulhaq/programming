package com.abhishek.bitwise;

public class ResetNthBit {
    public static void main(String[] args) {
        System.out.println(resetNthBit(10, 1));
    }

    public static int resetNthBit(int num, int N){
        return num & (~(1 << N));
    }
}
