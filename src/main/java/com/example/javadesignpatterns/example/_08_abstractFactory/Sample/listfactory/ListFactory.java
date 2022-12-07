package com.example.javadesignpatterns.example._08_abstractFactory.Sample.listfactory;

import com.example.javadesignpatterns.example._08_abstractFactory.Sample.factory.Factory;
import com.example.javadesignpatterns.example._08_abstractFactory.Sample.factory.Link;
import com.example.javadesignpatterns.example._08_abstractFactory.Sample.factory.Page;
import com.example.javadesignpatterns.example._08_abstractFactory.Sample.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
