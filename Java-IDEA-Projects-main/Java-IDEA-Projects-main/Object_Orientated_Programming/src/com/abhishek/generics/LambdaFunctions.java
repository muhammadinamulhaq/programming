package com.abhishek.generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

//        arr.forEach((item) -> System.out.println(item*2));
//        System.out.println(arr);

//        Consumer<Integer> fun = (item) -> System.out.println(item*2);
//        arr.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation subs = (a, b) -> a - b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(5, 4, sum));
        System.out.println(myCalc.operate(5, 4, prod));
        System.out.println(myCalc.operate(5, 4, subs));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}


interface Operation{
    int operation(int a, int b);
}