package com.company;

public class Cat {
    String name;
    String breed;
    String color;
    int age;
    double weight;
    Person owner;

    public Cat() {
    }

    public Cat(String name, String breed, String color, int age, double weight, Person owner) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }

    public void catInfo() {
        System.out.println("-------------------------");
        System.out.println("Owner: " + owner.name +" "+ owner.surname + "\n\nName of Cat: " + name + "\nBreed: " + breed + "\nColor: " + color + "\nAge: " + age + "\nWeight: " + weight);
        System.out.println("-------------------------\n");
    }

}
