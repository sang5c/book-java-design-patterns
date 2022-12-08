package com.example.javadesignpatterns.example.p13_visitor.a3a;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        System.out.println("dir: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        System.out.println("file: " + file);
        return FileVisitResult.CONTINUE;
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java com.example.javadesignpatterns.example._01_Iterator.samples.com.example.javadesignpatterns.example._01_Iterator.a1_.com.example.javadesignpatterns.example._02_adapter.sample2_.com.example.javadesignpatterns.example._02_adapter.sample1_.com.example.javadesignpatterns.example._23_Interpreter.a1.com.example.javadesignpatterns.example._22_command.an.com.example.javadesignpatterns.example._22_command.Sample.com.example.javadesignpatterns.example._21_proxy.A1.Main dirname");
            System.out.println("Example: java com.example.javadesignpatterns.example._01_Iterator.samples.com.example.javadesignpatterns.example._01_Iterator.a1_.com.example.javadesignpatterns.example._02_adapter.sample2_.com.example.javadesignpatterns.example._02_adapter.sample1_.com.example.javadesignpatterns.example._23_Interpreter.a1.com.example.javadesignpatterns.example._22_command.an.com.example.javadesignpatterns.example._22_command.Sample.com.example.javadesignpatterns.example._21_proxy.A1.Main .");
            System.exit(0);
        }

        String dirname = args[0];

        try {
            MyFileVisitor visitor = new MyFileVisitor();
            Path root = Path.of(dirname);
            Files.walkFileTree(root, visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
