package com.company;

public class Main {

    public static void main(String[] args) {

        // Animal Inheritance Example

        Cat cat = new Cat(false, "milk", 4, "black");
        Cat cat1 = new Cat(true, "cereal", 3, "grey");
        Cat cat2 = new Cat(false, "rice", 5, "orange");

        System.out.println("\n");
        System.out.println("*******************************");

        System.out.println("Cat is vegetarian? " + cat.isVegetarian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has  " + cat.getNoOfLegs() + "legs");
        System.out.println("Cat color is " + cat.getColor());

        System.out.println("\n");
        System.out.println("*******************************");

        System.out.println("Cat is vegetarian? " + cat1.isVegetarian());
        System.out.println("Cat eats " + cat1.getEats());
        System.out.println("Cat has  " + cat1.getNoOfLegs() + "legs");
        System.out.println("Cat color is " + cat1.getColor());

        System.out.println("\n");
        System.out.println("*******************************");

        System.out.println("Cat is vegetarian? " + cat2.isVegetarian());
        System.out.println("Cate eats " + cat2.getEats());
        System.out.println("Cat has  " + cat2.getNoOfLegs() + "legs");
        System.out.println("Cat color is " + cat2.getColor());


    }

}

