package com.example.javadesignpatterns.example.p09_bridge.a3;

public class IncreaseDisplay extends CountDisplay {
    private int step; // 증갓값 

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}