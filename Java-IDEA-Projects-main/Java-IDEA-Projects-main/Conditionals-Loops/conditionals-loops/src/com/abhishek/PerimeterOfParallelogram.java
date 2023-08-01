package com.abhishek;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = in.nextInt();
        int side = in.nextInt();

        System.out.println(2*(base + side));
    }
}
