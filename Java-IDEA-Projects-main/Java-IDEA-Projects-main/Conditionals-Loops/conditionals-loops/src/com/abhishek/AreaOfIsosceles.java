package com.abhishek;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextInt(); // equal sides
        double b = in.nextInt(); // base of isosceles triangle

        double area = (0.5 * Math.sqrt(a*a - (b*b/4)) * b);

        System.out.println(area);
    }
}
