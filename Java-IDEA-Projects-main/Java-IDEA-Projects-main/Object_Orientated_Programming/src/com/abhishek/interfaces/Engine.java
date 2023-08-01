package com.abhishek.interfaces;

public interface Engine {
    // all variables inside the interface are auto static and final
    static final int price = 78000;
    void start();
    void stop();
    void accelerate();
}
