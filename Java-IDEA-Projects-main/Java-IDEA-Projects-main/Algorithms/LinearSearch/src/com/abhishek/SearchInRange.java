package com.abhishek;

import java.util.ArrayList;

public class SearchInRange {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        arr.add(13);
        arr.add(23);

        System.out.println(search(arr, 1, 5, 3));
    }

    static boolean search(ArrayList<Integer> arr, int start, int end, int target){
        if(arr.size() == 0){
            return false;
        }

        for(int i = start; i <= end; i++){
            if(arr.get(i) == target){
                return true;
            }
        }

        return false;
    }
}
