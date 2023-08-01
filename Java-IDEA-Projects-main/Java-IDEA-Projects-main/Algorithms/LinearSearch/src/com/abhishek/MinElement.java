package com.abhishek;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {18, 3, 21, 19, 14};

        System.out.println(findMin(arr));
    }

    static int findMin(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
}
