package org.example;

public class FactoryMain {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        System.out.println(factory.getHuman("MALE"));
        System.out.println(factory.getHuman("FEMALE"));
    }
}