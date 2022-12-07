package com.example.javadesignpatterns.example._08_abstractFactory.A2.divfactory;

import com.example.javadesignpatterns.example._08_abstractFactory.A2.factory.Link;

public class DivLink extends Link {
    public DivLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<div class=\"LINK\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
    }
}
