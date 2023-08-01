package com.abhishek.bitwise;

public class APowB {
    public static void main(String[] args) {
        int base = 2;
        int n = 4;
        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans *= base;
            }
            base *= base;
            n = n >> 1;
        }

        System.out.println(ans);
    }


}
