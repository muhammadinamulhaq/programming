package com.abhishek.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 12, 14, 16, 18, 20};
        System.out.println(binarySearch(arr, 0, 10, 0));
    }

    static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return binarySearch(arr, start, mid - 1, target);
        }else{
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
