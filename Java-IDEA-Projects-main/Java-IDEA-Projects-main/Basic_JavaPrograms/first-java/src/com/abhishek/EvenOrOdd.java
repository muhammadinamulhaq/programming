package com.abhishek;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("It is an even number.");
        }else{
            System.out.println("It is an odd number.");
        }
    }
}
