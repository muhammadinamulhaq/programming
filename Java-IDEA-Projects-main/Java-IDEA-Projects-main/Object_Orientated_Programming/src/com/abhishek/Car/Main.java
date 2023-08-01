package com.abhishek.Car;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Porsche Model: " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Porsche Model: " + porsche.getModel());

        holden.setModel("Commodore");
        System.out.println("Holden Model: " + holden.getModel());
    }
}
