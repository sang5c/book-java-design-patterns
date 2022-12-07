package com.example.javadesignpatterns.example._06_prototype.A2.framework;

public interface Product {
    public abstract void use(String s);

    public abstract Product createCopy();
}
