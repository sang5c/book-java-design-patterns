package com.example.javadesignpatterns.example._05_singleton.Q3;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
