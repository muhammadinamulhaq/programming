package com.abhishek;

import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();

        for(int i = start; i < end; i++){
            if(armstrong(i)){
                System.out.print(i + " ");
            }
        }

//        System.out.println(armstrong(1634));
    }

    static int count(int num){
        int c = 0;
        while(num > 0){
            c++;
            num/=10;
        }
        return c;
    }


    static boolean armstrong(int i) {
        if(i < 10 && i > 0){
            return true;
        }
        int sum = 0;
        int temp = i;
        while(temp > 0){
            sum += Math.pow(temp%10, count(i));
            temp/=10;
        }
        return sum == i;
    }


}
