package com.abhishek;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6, 7, 67, 89, 99, 100};
        int[] arr2 = {100, 99, 79, 69, 59, 48, 34, 23, 11, 9};
        int target = 99;
        System.out.println(orderAgnosticBinarySearch(arr1, target));
        System.out.println(orderAgnosticBinarySearch(arr2, target));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
