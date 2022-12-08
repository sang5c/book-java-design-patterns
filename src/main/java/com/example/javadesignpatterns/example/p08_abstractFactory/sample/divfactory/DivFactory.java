package com.example.javadesignpatterns.example.p08_abstractFactory.sample.divfactory;

import com.example.javadesignpatterns.example.p08_abstractFactory.sample.factory.Factory;
import com.example.javadesignpatterns.example.p08_abstractFactory.sample.factory.Link;
import com.example.javadesignpatterns.example.p08_abstractFactory.sample.factory.Page;
import com.example.javadesignpatterns.example.p08_abstractFactory.sample.factory.Tray;

public class DivFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new DivPage(title, author);
    }
}
