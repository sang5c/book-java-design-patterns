package com.example.javadesignpatterns.example.p03_template_method.my_a4;

public interface Displayable {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    void open();

    void print();

    void close();

    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
