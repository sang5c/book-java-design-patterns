package com.example.javadesignpatterns.example.p23_interpreter.a1.language;

public abstract class Node implements Executor {
    public abstract void parse(Context context) throws ParseException;
}
