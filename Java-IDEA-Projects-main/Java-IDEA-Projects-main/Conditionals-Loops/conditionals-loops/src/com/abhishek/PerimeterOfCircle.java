package com.abhishek;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int radius = in.nextInt();

        System.out.println(2*Math.PI*radius);
    }
}
