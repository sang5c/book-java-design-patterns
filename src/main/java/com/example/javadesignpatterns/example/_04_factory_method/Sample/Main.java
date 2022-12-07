package com.example.javadesignpatterns.example._04_factory_method.Sample;

import com.example.javadesignpatterns.example._04_factory_method.Sample.framework.Factory;
import com.example.javadesignpatterns.example._04_factory_method.Sample.framework.Product;
import com.example.javadesignpatterns.example._04_factory_method.Sample.idcard.IDCardFactory;

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
