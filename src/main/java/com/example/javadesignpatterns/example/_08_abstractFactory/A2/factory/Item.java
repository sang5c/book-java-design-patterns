package com.example.javadesignpatterns.example._08_abstractFactory.A2.factory;

public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
