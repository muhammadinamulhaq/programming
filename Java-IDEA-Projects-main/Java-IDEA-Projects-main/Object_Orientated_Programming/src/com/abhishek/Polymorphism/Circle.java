package com.abhishek.Polymorphism;

public class Circle extends Shapes{
    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation (used for checking purpose, more in interfaces)
    void area(){
        System.out.println("Area is PI*r*r");
    }
}
