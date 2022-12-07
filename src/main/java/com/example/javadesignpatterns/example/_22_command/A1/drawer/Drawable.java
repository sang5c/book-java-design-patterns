package com.example.javadesignpatterns.example._22_command.A1.drawer;

import java.awt.Color;

public interface Drawable {
    public abstract void init();
    public abstract void draw(int x, int y);
    public abstract void setColor(Color color);
}
