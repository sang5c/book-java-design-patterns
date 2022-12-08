package com.example.javadesignpatterns.example.p04_factory_method.sample;

import com.example.javadesignpatterns.example.p04_factory_method.sample.framework.Factory;
import com.example.javadesignpatterns.example.p04_factory_method.sample.framework.Product;
import com.example.javadesignpatterns.example.p04_factory_method.sample.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();
    }
}
