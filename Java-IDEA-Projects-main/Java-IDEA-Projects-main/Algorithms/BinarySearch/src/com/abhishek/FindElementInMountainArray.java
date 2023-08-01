package com.abhishek;

public class FindElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,3,2,1};
        int target = 3;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int peak = peak(arr);
        int left = binarySearch(arr, target, start, peak, true);
        if(left == -1){
            return binarySearch(arr, target, peak, end, false);
        }

        return left;
    }

    static int peak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(arr[mid] < target){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
