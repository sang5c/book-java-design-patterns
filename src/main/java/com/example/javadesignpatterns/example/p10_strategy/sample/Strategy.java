package com.example.javadesignpatterns.example.p10_strategy.sample;

public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
