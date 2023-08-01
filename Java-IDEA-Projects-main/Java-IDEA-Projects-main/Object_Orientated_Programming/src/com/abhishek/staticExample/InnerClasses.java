package com.abhishek.staticExample;

// Note: static stuff is resolved during compile time

// outside classes cannot be static
public class InnerClasses {
    // inner classes can be static
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        // if class is not static we can't do something like this:
        Test a = new Test("Abhishek");
        Test b = new Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);

    }


}

// not possible
//static class A{
//
//}