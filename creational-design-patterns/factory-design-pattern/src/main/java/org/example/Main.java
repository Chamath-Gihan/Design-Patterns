package org.example;

public class Main {
    public static void main(String[] args) {
        HumanFactory factory = new HumanFactory();
        System.out.println(factory.getHuman("MALE"));
        System.out.println(factory.getHuman("FEMALE"));
    }
}