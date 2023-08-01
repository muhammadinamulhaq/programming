package com.abhishek.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4.6, 7.9, 9.9);
//        Box box2 = new Box(box); // copy constructor called

//        System.out.println(box.l);
//        System.out.println(box.w);
//        System.out.println(box.h);
//
//        BoxWeight box3 = new BoxWeight(1, 1, 1, 1);
//
//        System.out.println(box3.h + " " + box3.l + " " + box3.w + " " + box3.weight);

//        BoxPrice box = new BoxPrice();
//        A a = new C();
//
//        System.out.println(a.n);

            Box box1 = new Box();

            Box.greeting();

            Box box2 = new BoxWeight();

            box2.greeting();



    }
}
