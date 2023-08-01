package com.abhishek;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int breadth = in.nextInt();

        System.out.println(2*(length + breadth));
    }
}
