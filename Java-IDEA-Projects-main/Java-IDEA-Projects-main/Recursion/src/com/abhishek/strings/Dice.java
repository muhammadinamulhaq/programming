package com.abhishek.strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        diceCombination("", 4);
        System.out.println(diceCombinationRet("", 4));
        System.out.println();
    }

    static void diceCombination(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceCombination(p + i, target-i);
        }
    }

    static ArrayList<String> diceCombinationRet(String p, int target){
        if(target == 0){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceCombinationRet(p + i, target-i));
        }

        return list;
    }

    static void diceCombinationFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceCombinationFace(p + i, target-i, face);
        }
    }

    static ArrayList<String> diceCombinationFaceRet(String p, int target, int face){
        if(target == 0){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceCombinationFaceRet(p + i, target-i, face));
        }

        return list;
    }
}
