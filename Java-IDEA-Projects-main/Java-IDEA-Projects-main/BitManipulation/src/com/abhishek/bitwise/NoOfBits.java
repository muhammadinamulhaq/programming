package com.abhishek.bitwise;

public class NoOfBits {
    public static void main(String[] args) {
        int n = 2;
        int base= 2; // base 2 = binary, 8 = octal, 10 = decimal, 16 = hexadecimal
        int ans = calcBits(n, base);
        System.out.println(ans);
    }

    public static int calcBits(int N, int base){
        return (int)(Math.log(N) / Math.log(base)) + 1;
    }
}
