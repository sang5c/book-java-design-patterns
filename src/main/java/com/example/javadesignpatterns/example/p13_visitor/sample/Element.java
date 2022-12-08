package com.example.javadesignpatterns.example.p13_visitor.sample;

public interface Element {
    public abstract void accept(Visitor v);
}
