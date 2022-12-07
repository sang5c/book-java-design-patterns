package com.example.javadesignpatterns.example._23_Interpreter.sample;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
