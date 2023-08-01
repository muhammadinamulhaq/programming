package com.abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter an operator: ");
        char op = scn.next().charAt(0);

        System.out.print("Enter two numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        if (op == '+') {
            System.out.println("Sum: " + (a + b));
        } else if (op == '-') {
            System.out.println("Difference: " + (a - b));
        } else if (op == '*') {
            System.out.println("Multiplication: " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("second number is 0, result not defined.");
            }

        }

//        int salary = 2000;
//
//        if(salary > 1000){
//            System.out.println("Yes greater than 1000");
//        }else if(salary > 1500){
//            System.out.println("Yes greater than 1500");
//        }else{
//            System.out.println("Less than 1000");
//        }
    }
}
