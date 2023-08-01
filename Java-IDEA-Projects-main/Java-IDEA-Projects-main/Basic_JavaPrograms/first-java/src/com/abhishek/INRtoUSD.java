package com.abhishek;

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double INR = in.nextDouble();

        System.out.println(INR/80.1);
    }
}
