package com.example.javadesignpatterns.example._10_strategy.Sample;

public interface Strategy {
    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
