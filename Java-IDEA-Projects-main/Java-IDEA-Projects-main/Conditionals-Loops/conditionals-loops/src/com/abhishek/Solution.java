package com.abhishek;

class Solution {
    public static void main(String[] args) {
        String[] words = {"aba", "bbb", "ccc", "ddd"};
        System.out.println(oddString(words));
    }

    static String oddString(String[] words) {
        int size = words.length;
        int len = words[0].length();
        int[] arr = new int[len - 1];

        for(int i = 0; i < len - 1; i++){
            arr[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }

        String ans = "";

        for(int i = 0; i < len - 1; i++){
            if(arr[i] != words[1].charAt(i + 1) - words[1].charAt(i)){
                ans = words[0];
            }
            arr[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }
//
//        for(int i = 0; i < len - 1; i++){
//            if(arr[i] != words[2].charAt(i + 1) - words[2].charAt(i)){
//                ans = words[1];
//            }
//            arr[i] = words[2].charAt(i + 1) - words[2].charAt(i);
//        }


        for(int i = 1; i < size - 1; i++){
            for(int j = 0; j < len - 1; j++){
                int check = words[i + 1].charAt(j + 1) - words[i + 1].charAt(j);
                int check2 = words[i - 1].charAt(j + 1) - words[i - 1].charAt(j);
                if(arr[j] != check && arr[j] != check2){
                    ans = words[i];
                }

                arr[j] = words[i + 1].charAt(j + 1) - words[i + 1].charAt(j);
            }
        }

        for(int i = 0; i < len - 1; i++){
            if(arr[i] != words[size - 1].charAt(i + 1) - words[1].charAt(i)){
                ans = words[0];
            }
            arr[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }

//        ans = words[size - 1];
        return ans;
    }


    static String oddString(String[] words) {
        int size = words.length;
        int len = words[0].length();
        int[] arr = new int[len - 1];

        for(int i = 0; i < len - 1; i++){
            arr[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }

        String ans = "";

        for(int i = 0; i < len - 1; i++){
            if(arr[i] != words[1].charAt(i + 1) - words[1].charAt(i)){
                ans = words[0];
            }
            arr[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }


        for(int i = 1; i < size - 1; i++){
            for(int j = 0; j < len - 1; j++){
                int check = words[i + 1].charAt(j + 1) - words[i + 1].charAt(j);
                int check2 = words[i - 1].charAt(j + 1) - words[i - 1].charAt(j);
                if(arr[j] != check && arr[j] != check2){
                    ans = words[i];
                }

                arr[j] = words[i + 1].charAt(j + 1) - words[i + 1].charAt(j);
            }
        }

        for(int i = 0; i < len - 1; i++){
            if(arr[i] != words[size - 1].charAt(i + 1) - words[1].charAt(i)){
                ans = words[0];
            }
            arr[i] = words[1].charAt(i + 1) - words[1].charAt(i);
        }

        return ans;
    }
}