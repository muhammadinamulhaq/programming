package com.abhishek;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double length = in.nextInt();
        double width = in.nextInt();
        double height = in.nextInt();
        double volume = (length*width*height)/3.0;

        System.out.println(volume);
    }
}
