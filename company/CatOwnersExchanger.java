package com.company;

public class CatOwnersExchanger {

    public void changeOwners(Cat firstCat, Cat secondCat) {
        Person bufferedOwner = firstCat.owner;

        firstCat.owner = secondCat.owner;
        secondCat.owner = bufferedOwner;

        System.out.println("Exchange completed");
        firstCat.catInfo();
        secondCat.catInfo();
    }
}
