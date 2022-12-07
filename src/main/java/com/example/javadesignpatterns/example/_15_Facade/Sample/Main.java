package com.example.javadesignpatterns.example._15_Facade.Sample;

import com.example.javadesignpatterns.example._15_Facade.Sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
    }
}
