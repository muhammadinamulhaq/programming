package com.abhishek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
//        int[] rns = {1,2,3,4,5};
//        System.out.println(Arrays.toString(rns));
//
//        String[] arr = new String[5];
//        System.out.println(arr[0]);
//
//        int[][] arr2D = new int[3][2];

//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length;  col++) {
//                arr2D[row][col] = in.nextInt();
//            }
//        }
//
//
//        for (int row = 0; row < arr2D.length; row++) {
//            System.out.println(Arrays.toString(arr2D[row]));
//        }

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(45);
        list.add(145);
        list.add(45);

        System.out.println(list.contains(45));


        System.out.println(list);
    }

}
