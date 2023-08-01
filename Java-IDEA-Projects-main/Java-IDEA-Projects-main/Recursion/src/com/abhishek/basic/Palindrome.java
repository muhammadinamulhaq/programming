package com.abhishek.basic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1));
    }

    static boolean palindrome(int n){
        return n == reverse(n);
    }

    static int reverse(int n){
        if(n%10 == n){
            return n;
        }
        int count = (int)Math.log10(n) + 1;
        return (n % 10)*(int)Math.pow(10, count - 1) + reverse(n / 10);
    }
}
