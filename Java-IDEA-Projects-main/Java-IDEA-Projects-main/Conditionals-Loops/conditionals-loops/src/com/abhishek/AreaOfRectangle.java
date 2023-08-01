package com.abhishek;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int breadth = in.nextInt();

        System.out.println(length*breadth);
    }
}
