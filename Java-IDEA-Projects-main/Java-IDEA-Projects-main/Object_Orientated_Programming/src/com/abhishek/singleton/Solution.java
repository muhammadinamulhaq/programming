package com.abhishek.singleton;

class Solution {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles, 8));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = max(piles);
        int res = end;
        while(start <= end){
            int k = (start + end) / 2;
            int hours = 0;
            for(int i: piles){
                hours += Math.ceil(i / (float)k);
            }
            if(hours <= h){
                res = Math.min(res, k);
                end = k - 1;
            }else{
                start = k + 1;
            }
        }
        
        return res;
    }

    
    public static int min(int a, int b){
        return Math.min(a, b);
    }
    
    public static int max(int[] piles){
        int max = Integer.MIN_VALUE;

        for (int pile : piles) {
            if (max < pile) {
                max = pile;
            }
        }
        
        return max;
    }
}