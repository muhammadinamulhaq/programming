package com.abhishek.basic;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes2(324));
    }

    static int countZeroes(int n){
        if(n == 0){
            return 0;
        }
        if((n % 10) == 0){
            return 1 + countZeroes(n / 10);
        }
        return countZeroes(n / 10);
    }

    static int countZeroes2(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        if((n % 10) == 0){
            return helper(n / 10, count+1);
        }
        return helper(n / 10, count);
    }
}
