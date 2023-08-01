package com.abhishek.staticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // static block will be executed once when any first object is created.
    // used to init the static members
    static{
        System.out.println("I am in a static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();

        // static {} block didn't run for the second time, when obj2 is created, b remains unchanged!
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }


}
