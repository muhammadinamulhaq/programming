package com.abhishek.staticExample;

public class Main {
    public static void main(String[] args) {
        Human abhishek = new Human(22, "Abhishek Chandra", 10000, false);
        Human rahul = new Human(34, "Rahul", 15000, true);

        System.out.println(Human.population);

        Main m = new Main();
        m.fun2();
    }

    // this is not dependent on objects, doesn't belong to an instance
    static void fun(){
//        greeting();  // you cant use this because it requires an instances
//        // but function you are using it in does not depend on instances


        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, I am referencing it
        Main m = new Main(); // from this object we can use the greeting methods
        m.greeting();
    }

    // it will be fine
    void fun2(){
        greeting();
    }

    // we know that something which is not static, belong to an object
    void greeting(){
//        fun(); // you can have a static method inside a non-static method
        System.out.println("Hello world");
    }
}
