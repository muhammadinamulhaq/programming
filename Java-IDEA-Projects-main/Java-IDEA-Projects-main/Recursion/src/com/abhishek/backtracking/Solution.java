package com.abhishek.backtracking;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }else {
                mp.put(nums[i], 1);
            }
        }
        
        int ans = 0;
        
        for(Map.Entry<Integer, Integer> m: mp.entrySet()){
            if(m.getValue() > nums.length / 2){
                ans = m.getKey();
                break;
            }
        }
        
        return ans;
    }
}