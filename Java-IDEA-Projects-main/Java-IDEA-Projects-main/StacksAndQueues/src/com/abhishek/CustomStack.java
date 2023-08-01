package com.abhishek;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int top = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        top++;
        this.data[top] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!");
        }
        return data[top--];
    }

    public int peak() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot find peak in an empty stack!");
        }
        return data[top];
    }

    public boolean isFull(){
        return top == (data.length - 1); // top is at last index
    }

    public boolean isEmpty(){
        return top == -1; //  top is -1 if the array is empty
    }
}
