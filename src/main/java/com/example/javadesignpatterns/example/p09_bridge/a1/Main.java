package com.example.javadesignpatterns.example.p09_bridge.a1;

public class Main {
    public static void main(String[] args) {
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello, Korea."));
        d.randomDisplay(10);
    }
}
