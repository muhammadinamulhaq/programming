package com.abhishek;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base = in.nextDouble();
        double height = in.nextDouble();


        System.out.println(0.5 * base * height);
    }
}
