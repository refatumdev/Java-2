package com.company;

public class Person {
    String name;
    String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void personInfo() {
        System.out.println(name + " " + surname);
    }
}