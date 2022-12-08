package com.example.javadesignpatterns.example.p08_abstractFactory.a2.factory;

public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
