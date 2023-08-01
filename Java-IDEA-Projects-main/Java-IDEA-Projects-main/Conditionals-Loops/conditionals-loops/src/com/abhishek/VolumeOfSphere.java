package com.abhishek;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius = in.nextInt();
        double volume = (4.0/3.0) * Math.PI * (radius*radius*radius);

        System.out.println(volume);
    }
}
