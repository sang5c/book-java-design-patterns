package com.example.javadesignpatterns.example._09_bridge.A1;

public class Main {
    public static void main(String[] args) {
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
        d.randomDisplay(10);
    }
}
