package com.example.javadesignpatterns.example._04_factory_method.Sample.idcard;

import com.example.javadesignpatterns.example._04_factory_method.Sample.framework.Factory;
import com.example.javadesignpatterns.example._04_factory_method.Sample.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
