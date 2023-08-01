package com.abhishek;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {28, 5, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 34;
        System.out.println(Arrays.toString(searchIndex(arr, target)));
        System.out.println(max(arr));
    }

    static boolean search(int[][] arr,int target){
        for (int[] ints : arr) {
            for (int j : ints) {
                if(j == target){
                    return true;
                }
            }
        }
        return false;
    }

    static int[] searchIndex(int[][] arr, int target){
        int[] ans = {-1, -1};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    ans[0] = row;
                    ans[1] = col;
                    return ans;
                }
            }
        }
        return ans;
    }
    static int max(int[][] arr){
        if(arr.length == 0){
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for (int[] i: arr) {
            for (int j: i) {
                if(max < j){
                    max = j;
                }
            }
        }
        return max;
    }
}
