package com.abhishek;

// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(arr));
    }


    static int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int[] i: accounts){
            for(int j: i){
                sum += j;
            }

            if(maxSum < sum){
                maxSum = sum;
            }
            sum = 0;
        }

        return maxSum;
    }
}
