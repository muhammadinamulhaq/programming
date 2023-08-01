package com.abhishek.bitwise;

public class SetNthBit {
    public static void main(String[] args) {
        System.out.println(setNthBit(10, 2));
    }

    public static int setNthBit(int num, int N){
        return num | (1 << N);
    }

}
