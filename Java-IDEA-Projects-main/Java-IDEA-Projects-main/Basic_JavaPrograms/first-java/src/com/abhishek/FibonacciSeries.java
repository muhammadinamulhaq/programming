package com.abhishek;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        for (int i = 0; i < n - 2; i++) {
            int x = first + second;
            first = second;
            second = x;
            System.out.print(" " + x);
        }
    }
}
