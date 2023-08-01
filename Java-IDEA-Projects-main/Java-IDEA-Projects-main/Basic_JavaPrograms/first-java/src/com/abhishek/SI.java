package com.abhishek;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int p = scn.nextInt();
        int r = scn.nextInt();
        int t = scn.nextInt();

        System.out.println("SI: " + p*r*t / 100);
    }
}
