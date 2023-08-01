package com.abhishek;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius = in.nextInt();
        double height = in.nextInt();
        double volume = Math.PI * (radius*radius) * (height);

        System.out.println(volume);
    }
}
