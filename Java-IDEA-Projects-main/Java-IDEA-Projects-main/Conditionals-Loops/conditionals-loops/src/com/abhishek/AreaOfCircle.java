package com.abhishek;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int radius = in.nextInt();

        System.out.println(Math.PI * radius * radius);
    }
}
