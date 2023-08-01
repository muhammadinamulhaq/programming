package com.abhishek;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int target = 456;
//        int ans = binarySearch(arr, target);
//        System.out.println(ans);
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7}
        };

        System.out.println(matrix.length);

    }

    // return the index
    // return -1 if doesn't exist
    static int binarySearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/ 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }
        }

        return -1;
    }
}
