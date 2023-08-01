package com.abhishek;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int i) {
//        int c = 0;
//        while(i > 0){
//            c++;
//            i/=10;
//        }
//        return c % 2 == 0;
        String c = i + "";
        return c.length()%2 == 0;
    }

    static int count2(int num){
        return (int)(Math.log10(num));
    }
}
