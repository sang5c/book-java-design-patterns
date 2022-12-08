package com.example.javadesignpatterns.example.p13_visitor.sample;

public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
