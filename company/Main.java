package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person("Bob", "Smith");
        Person secondPerson = new Person("Lucy", "King");

        Cat firstCat = new Cat("Bella", "British", "Black", 5, 4.6, firstPerson);
        Cat secondCat = new Cat("Loki", "Persian", "Orange", 7, 5.4, secondPerson);


        firstCat.catInfo();
        secondCat.catInfo();

        CatOwnersExchanger catOwnersExchanger = new CatOwnersExchanger();
        catOwnersExchanger.changeOwners(firstCat, secondCat);
    }

}
