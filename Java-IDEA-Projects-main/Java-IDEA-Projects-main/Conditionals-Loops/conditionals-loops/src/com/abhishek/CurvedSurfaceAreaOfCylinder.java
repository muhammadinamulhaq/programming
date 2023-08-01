package com.abhishek;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius = in.nextInt();
        double height = in.nextInt();

        System.out.println(2 * Math.PI * radius * height);
    }
}
