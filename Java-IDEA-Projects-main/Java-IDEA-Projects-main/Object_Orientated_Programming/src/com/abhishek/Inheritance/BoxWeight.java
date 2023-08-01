package com.abhishek.Inheritance;

public class BoxWeight extends Box{
    int weight;

    public BoxWeight(){
        this.weight = -1;
    }

    static void greeting(){
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, int weight) {
        super(side); // call the parent class constructor
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, int weight) {
        super(l, h, w); // call the parent class constructor
        this.weight = weight;
    }

    public BoxWeight(Box old, int weight) {
        super(old); // call the parent class constructor
        this.weight = weight;
    }

    public BoxWeight(BoxWeight old){
        super(old); // call the parent class constructor
        this.weight = old.weight;
    }
}
