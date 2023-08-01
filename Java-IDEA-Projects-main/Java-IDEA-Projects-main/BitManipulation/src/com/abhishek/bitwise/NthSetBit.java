package com.abhishek.bitwise;

public class NthSetBit {
    public static void main(String[] args) {
        System.out.println(NthSetBit(4, 1));
    }

    private static boolean NthSetBit(int i, int i1) {
        return (i & (1 << i1)) != 0;
    }


}
