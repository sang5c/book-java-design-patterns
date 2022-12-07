package com.example.javadesignpatterns.example._06_prototype.Sample.framework;

public interface Product extends Cloneable {
    public abstract void use(String s);

    public abstract Product createCopy();
}
