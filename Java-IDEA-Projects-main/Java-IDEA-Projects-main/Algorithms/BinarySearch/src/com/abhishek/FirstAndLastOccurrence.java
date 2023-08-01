package com.abhishek;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 5, 5, 7, 123, 234};
        int target = 1;
        System.out.println(Arrays.toString(find(arr, target)));
    }

    static int[] find(int[] arr, int target){
        int[] ans = {-1, -1};
        ans[0] = binarySearch(arr, target, true);
        if(ans[0] != -1){
            ans[1] = binarySearch(arr, target, false);
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
