package com.abhishek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.println("Enter size of the array: ");
//        int size = in.nextInt();

        int[] arr = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] array, int target){
        if(array.length == 0){
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                return i;
            }
        }

        return -1;
    }
}
