package com.abhishek.basic;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(123040));
    }

    static int reverse(int n){
        if(n%10 == n){
            return n;
        }
        int count = (int)Math.log10(n) + 1;
//        int temp = n;
//        while(temp > 0){
//            count++;
//            temp /= 10;
//        }

        return (n % 10)*(int)Math.pow(10, count - 1) + reverse(n / 10);
    }
}
