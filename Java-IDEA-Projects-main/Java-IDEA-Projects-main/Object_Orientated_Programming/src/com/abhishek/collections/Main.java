package com.abhishek.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(78);
        list2.add(55);
        list2.add(89);

        System.out.println(list2);

        List<Integer> vec = new Vector<>();

        vec.add(45);
        vec.add(5);
        vec.add(15);
        vec.add(56);

        System.out.println(vec);

    }
}
