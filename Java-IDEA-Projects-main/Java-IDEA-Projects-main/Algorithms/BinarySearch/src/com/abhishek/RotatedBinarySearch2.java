package com.abhishek;

public class RotatedBinarySearch2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);

        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if(target == nums[pivot]){
            return true;
        }

        if(nums[0] <= target){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        if(end == 0){
            return end;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }else if(mid > 0 && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(end > 0 && arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return false;
    }

}
