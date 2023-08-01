package com.abhishek;

public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
//        stack.push(18);

//        System.out.println(stack.isFull());
//        System.out.println(stack.peak());
//        System.out.println(stack.isEmpty());
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        DynamicStack newStack = new DynamicStack();

        newStack.push(34);
        newStack.push(45);
        newStack.push(2);
        newStack.push(9);
        newStack.push(18);
        newStack.push(18);
        newStack.push(18);
        newStack.push(18);
        newStack.push(18);


//        System.out.println(newStack.isFull());
//        System.out.println(newStack.peak());
//        System.out.println(newStack.isEmpty());

        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
    }
}
