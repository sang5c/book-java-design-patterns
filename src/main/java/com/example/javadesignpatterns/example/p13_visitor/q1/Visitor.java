package com.example.javadesignpatterns.example.p13_visitor.q1;

public abstract class Visitor {
    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
