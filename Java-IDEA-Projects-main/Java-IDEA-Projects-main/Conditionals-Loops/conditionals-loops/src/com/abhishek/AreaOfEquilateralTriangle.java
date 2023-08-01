package com.abhishek;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();

        double area = Math.sqrt(3)*a*a / 4;

        System.out.printf("Area of Equilateral Triangle: %.2f", area);
    }
}
