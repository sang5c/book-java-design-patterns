package com.example.javadesignpatterns.example._02_adapter.q2;

import java.io.IOException;

// FileProperties 클래스를 구현해 보세요.
public class FileProperties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {

    }

    @Override
    public void writeToFile(String filename) throws IOException {

    }

    @Override
    public void setValue(String key, String value) {

    }

    @Override
    public String getValue(String key) {
        return null;
    }
}
