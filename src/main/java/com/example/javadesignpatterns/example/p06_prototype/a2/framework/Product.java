package com.example.javadesignpatterns.example.p06_prototype.a2.framework;

public interface Product {
    public abstract void use(String s);

    public abstract Product createCopy();
}
