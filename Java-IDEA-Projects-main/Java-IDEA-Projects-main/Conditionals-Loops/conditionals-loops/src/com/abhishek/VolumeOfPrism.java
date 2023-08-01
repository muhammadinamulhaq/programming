package com.abhishek;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextInt();
        double b = in.nextInt();
        double h = in.nextInt();
        double volume = TriangularPrismVolume(a, b, h);

        System.out.println(volume);
    }

    static double TriangularPrismVolume(double a, double b, double h){
        return (0.5)*a*b*h;
    }

    static double RectangularPrismVolume(double l, double b, double h){
        return l*b*h;
    }

    static double PentagonalPrismVolume(double a, double b, double h){
        return (5.0/2.0)*a*b*h;
    }

    static double HexagonalPrismVolume(double a, double b, double h){
        return 3*a*b*h;
    }
}
