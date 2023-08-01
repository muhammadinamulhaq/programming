package com.abhishek.bitwise;

public class ThreeInOneAppearance {
    public static void main(String[] args) {
        int[] arr = {-2,-2,1,-4,-4,-4,-2};
//        System.out.println(Integer.toBinaryString((int)Math.pow(2,30)));
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int[] arr = new int[4];

        int i = 3;

        for(int j = 0; j < nums.length; j++){
            while(nums[j] != 0 && i > 0){
                arr[i] += nums[j] & 1;
                nums[j] = nums[j] >>> 1;
                i--;
            }
            i = 3;
        }

        int ans = 0;
        i = 0;
        for(int j = 3; j >= 0 && i < 3; j--){
            ans += (arr[j] % 3)*Math.pow(2, i);
            i++;
        }

        return ans;
    }
}
