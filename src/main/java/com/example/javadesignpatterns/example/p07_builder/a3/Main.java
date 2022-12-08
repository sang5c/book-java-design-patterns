package com.example.javadesignpatterns.example.p07_builder.a3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FrameBuilder framebuilder = new FrameBuilder();
        Director director = new Director(framebuilder);
        director.construct();
        JFrame frame = framebuilder.getFrameResult();
        frame.setVisible(true);
    }
}
