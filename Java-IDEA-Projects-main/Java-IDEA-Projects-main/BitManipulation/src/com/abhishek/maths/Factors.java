package com.abhishek.maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factor3(20);
    }

     // O(n)
    static void factor1(int n){
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(n))
    static void factor2(int n){
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    // O(sqrt(n)) space: O(sqrt(n))
    static void factor3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= n; i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size() - 1; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
