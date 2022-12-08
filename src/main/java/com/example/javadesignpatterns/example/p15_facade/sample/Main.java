package com.example.javadesignpatterns.example.p15_facade.sample;

import com.example.javadesignpatterns.example.p15_facade.sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
    }
}
