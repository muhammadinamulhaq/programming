package com.abhishek.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> a: ans){
            System.out.println(a);
        }
    }

    // time and space complexity: O(2^N * N)
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());

        for(int num: arr){
            int n = list.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(list.get(i));
                internal.add(num);
                list.add(internal);
            }
        }

        return list;
    }

    // time and space complexity: O(2^N * N)
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = list.size() - 1;
            int n = list.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(list.get(j));
                internal.add(arr[i]);
                list.add(internal);
            }
        }

        return list;
    }
}
