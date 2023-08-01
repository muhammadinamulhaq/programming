package com.abhishek.array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
//        System.out.println(search(arr, 5, 0));
//        System.out.println(searchIndex(arr, 5, 0));
//        System.out.println(searchIndexLast(arr, 5, arr.length - 1));
//        searchAllIndex(arr, 5, 0);
//        System.out.println(list);
//        ArrayList<Integer> l1 = new ArrayList<>();
//        System.out.println(searchAllIndexList(arr, 5, 0, l1));
//        System.out.println(l1);
        System.out.println(searchAllIndexList2(arr, 5, 0));
    }

    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return (arr[index] == target) || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return searchIndex(arr, target, index + 1);
    }

    static int searchIndexLast(int[] arr, int target, int index){
        if(index == -1){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }

        return searchIndex(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static int searchAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return searchAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> searchAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return searchAllIndexList(arr, target, index + 1, list);
    }

    static ArrayList<Integer> searchAllIndexList2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        // this will contain ans for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = searchAllIndexList2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
