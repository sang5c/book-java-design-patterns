package com.example.javadesignpatterns.example.p08_abstractFactory.sample.listfactory;

import com.example.javadesignpatterns.example.p08_abstractFactory.sample.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
