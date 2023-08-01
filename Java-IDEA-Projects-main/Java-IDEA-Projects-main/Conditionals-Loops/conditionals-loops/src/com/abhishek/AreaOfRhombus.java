package com.abhishek;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double d1 = in.nextDouble();
        double d2 = in.nextDouble();

        System.out.println("Area of rhombus: " + (0.5)*d1*d2);

        double base = in.nextDouble();
        double degrees = in.nextDouble();
        double radians = Math.toRadians(degrees);

        System.out.println("Area of rhombus: " + base*base*Math.sin(radians));
    }
}