package com.example.javadesignpatterns.example.p13_visitor.a2;

public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
