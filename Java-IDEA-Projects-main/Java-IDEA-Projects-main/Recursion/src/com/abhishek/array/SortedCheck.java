package com.abhishek.array;

public class SortedCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9};
        System.out.println(checkSorting(arr));
    }

    static boolean checkSorting(int[] arr){
        return helper(arr, 0);
    }

    static boolean helper(int[] arr, int start){
        // base condition
        if(start == arr.length - 1){
            return true;
        }


        return (arr[start] < arr[start + 1]) && helper(arr, start + 1);
    }
}
