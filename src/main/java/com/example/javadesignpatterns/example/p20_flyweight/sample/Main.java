package com.example.javadesignpatterns.example.p20_flyweight.sample;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java com.example.javadesignpatterns.example._01_Iterator.samples.com.example.javadesignpatterns.example._01_Iterator.a1_.com.example.javadesignpatterns.example._02_adapter.sample2_.com.example.javadesignpatterns.example._02_adapter.sample1_.com.example.javadesignpatterns.example._23_Interpreter.a1.com.example.javadesignpatterns.example._22_command.an.com.example.javadesignpatterns.example._22_command.Sample.com.example.javadesignpatterns.example._21_proxy.A1.Main digits");
            System.out.println("Example: java com.example.javadesignpatterns.example._01_Iterator.samples.com.example.javadesignpatterns.example._01_Iterator.a1_.com.example.javadesignpatterns.example._02_adapter.sample2_.com.example.javadesignpatterns.example._02_adapter.sample1_.com.example.javadesignpatterns.example._23_Interpreter.a1.com.example.javadesignpatterns.example._22_command.an.com.example.javadesignpatterns.example._22_command.Sample.com.example.javadesignpatterns.example._21_proxy.A1.Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        bs.print();
    }
}
