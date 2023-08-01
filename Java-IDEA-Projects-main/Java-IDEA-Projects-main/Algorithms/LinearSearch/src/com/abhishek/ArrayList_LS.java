package com.abhishek;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_LS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            arr.add(in.nextInt());
        }

        int target = in.nextInt();

        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(ArrayList<Integer> array, int target){
        if(array.size() == 0){
            return -1;
        }

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) == target){
                return i;
            }
        }

        return -1;
    }
}
