package com.abhishek.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhi = new Human(22, "Abhishek Chandra");
//        Human twin = new Human(abhi);

        Human twin = (Human)abhi.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
//        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        twin.name = "abhishek";
        // shallow copied so abhi arr also changed, primitive types only gets new copy, non-primitive points to same object in the heap
//        System.out.println(abhi.name);
        System.out.println(Arrays.toString(abhi.arr));
        System.out.println(Arrays.toString(twin.arr));
    }
}
