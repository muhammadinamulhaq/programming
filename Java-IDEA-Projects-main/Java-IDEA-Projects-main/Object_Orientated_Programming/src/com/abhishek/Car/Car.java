package com.abhishek.Car;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String isValid = model.toLowerCase();
        if(isValid.equals("carrera") || isValid.equals("commodore")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
