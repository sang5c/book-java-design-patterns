package com.example.javadesignpatterns.example.p03_template_method.a4;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
