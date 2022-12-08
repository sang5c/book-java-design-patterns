package com.example.javadesignpatterns.example.p08_abstractFactory.a2.factory;

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
