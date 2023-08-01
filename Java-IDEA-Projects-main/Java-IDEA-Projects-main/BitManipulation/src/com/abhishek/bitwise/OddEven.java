package com.abhishek.bitwise;

import java.util.Scanner;
// Q1
public class OddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println(isOdd(scn.nextInt()));
    }

    private static boolean isOdd(int nextInt) {
        return (nextInt & 1) == 1;
    }
}
