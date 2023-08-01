package com.abhishek;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int sum = 0;
        double realSum = (nums.length) * Math.ceil((double)(nums.length + 1) / 2.0);

        for (int num : nums) {
            sum += num;
        }

        return (int)realSum - sum;
    }
}
