package com.example.javadesignpatterns.example._08_abstractFactory.A2.divfactory;

import com.example.javadesignpatterns.example._08_abstractFactory.A2.factory.Item;
import com.example.javadesignpatterns.example._08_abstractFactory.A2.factory.Tray;

public class DivTray extends Tray {
    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item : tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}