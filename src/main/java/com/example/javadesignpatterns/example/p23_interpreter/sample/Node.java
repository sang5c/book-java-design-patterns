package com.example.javadesignpatterns.example.p23_interpreter.sample;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
