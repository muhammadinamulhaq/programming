package com.abhishek.access;

import java.util.Arrays;

public class ObjectDemo {
    int num;
    float gpa;
    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // string representation of the class
    @Override
    public String toString() {
        return super.toString();
    }

    // garbage collection
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    // returns a random number calculated via some internal algorithm (we don't want to know)
    @Override
    public int hashCode() {
        return super.hashCode();
//        return this.num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 56.6f);
        ObjectDemo obj2 = new ObjectDemo(34, 56.6f);

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        if(obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }

        if(obj == obj2){
            System.out.println("obj is equal to obj2");
        }

        System.out.println(Arrays.toString(obj.getClass().getConstructors()));
    }
}
