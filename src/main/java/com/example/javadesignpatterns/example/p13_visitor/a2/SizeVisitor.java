package com.example.javadesignpatterns.example.p13_visitor.a2;

public class SizeVisitor extends Visitor {
    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (Entry entry : directory) {
            entry.accept(this);
        }
    }
}
