package com.example.javadesignpatterns.example.p23_interpreter.a1.language;

public interface ExecutorFactory {
    public abstract Executor createExecutor(String name);
}
