package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        System.out.println("-- Try removing from empty cart --");
        DigitalVideoDisc nonExist = new DigitalVideoDisc("NonExist");
        cart.removeDVD(nonExist);
        cart.print();

        System.out.println("\n-- Add single DVD and print --");
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        cart.addDVD(dvd1);
        cart.print();

        System.out.println("\n-- Add two DVDs at once --");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        cart.addDVD(dvd2, dvd3);
        cart.print();

        System.out.println("\n-- Add multiple DVDs (varargs) --");
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Cinderella");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Toy Story");
        cart.addDVD(dvd4, dvd5);
        cart.print();

        System.out.println("\n-- Try removing a DVD not in cart --");
        DigitalVideoDisc notInCart = new DigitalVideoDisc("Not In Cart");
        cart.removeDVD(notInCart);
        cart.print();

        System.out.println("\n-- Remove an existing DVD and print --");
        cart.removeDVD(dvd2);
        cart.print();

        System.out.println("\n-- Fill cart up to 20 items --");
        Cart fillCart = new Cart();
        for (int i = 1; i <= 20; i++) {
            fillCart.addDVD(new DigitalVideoDisc("DVD-" + i));
        }
        fillCart.print();

        System.out.println("\n-- Try to add one more beyond capacity --");
        fillCart.addDVD(new DigitalVideoDisc("Overflow"));
        fillCart.print();
    }
}
