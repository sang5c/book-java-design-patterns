package com.example.javadesignpatterns.example.p08_abstractFactory.a2.listfactory;

import com.example.javadesignpatterns.example.p08_abstractFactory.a2.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
