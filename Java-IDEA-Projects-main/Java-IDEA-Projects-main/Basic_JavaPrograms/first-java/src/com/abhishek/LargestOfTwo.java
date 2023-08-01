package com.abhishek;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " greater than " + num2);
        }else if(num1 == num2){
            System.out.println(num1 + " is equal to " + num2);
        }else{
            System.out.println(num1 + " is less than " + num2);
        }
    }
}
