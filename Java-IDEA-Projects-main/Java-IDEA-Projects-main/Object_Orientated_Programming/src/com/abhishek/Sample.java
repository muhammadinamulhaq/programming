package com.abhishek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sample {
    public static void main(String[] args) {
//        List<List<Integer>> res = threeSum(new int[]{-1,0,1,2,-1,-4});
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-1);
        list.add(-1);
        res.add(list);
//        list.clear();
        list.add(0);
        list.add(-1);
        list.add(-1);
        res.add(list);
        list.clear();
        System.out.println(res);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if((i > 0) && (nums[i] == nums[i - 1])) continue;
            int start = i + 1;
            int end = nums.length - 1;

            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    if(!list.isEmpty()) res.add(list);
                    System.out.println(res);
                    start++;
                    while((nums[start] == nums[start - 1]) && (start < end)){
                        start++;
                    }
                }else if(sum > 0){
                    end--;
                }else{
                    start++;
                }
                list.clear();
            }
        }
        return res;
    }
}