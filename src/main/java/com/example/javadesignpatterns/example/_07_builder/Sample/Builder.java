package com.example.javadesignpatterns.example._07_builder.Sample;

public abstract class Builder {
    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();
}