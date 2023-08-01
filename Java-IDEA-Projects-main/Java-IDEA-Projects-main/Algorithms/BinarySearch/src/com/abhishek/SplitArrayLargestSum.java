package com.abhishek;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(splitArray(arr, 2));
    }

    static int splitArray(int[] nums, int k) {
        int start = max(nums);
        int end = arrSum(nums);
        while(start < end){
            int mid = start + (end - start) /2;
            if(pieces(nums, mid) <= k){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }

    static int arrSum(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    static int pieces(int[] arr, int mid){
        int sum = 0;
        int count = 0;
        for (int j : arr) {
            sum += j;
            if (sum > mid) {
                count++;
                sum = 0;
                sum += j;
            }
        }

        return count + 1;
    }
}
