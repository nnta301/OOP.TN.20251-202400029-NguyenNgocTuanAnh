package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        System.out.println("-- Add some DVDs to store --");
        DigitalVideoDisc d1 = new DigitalVideoDisc("The Matrix");
        DigitalVideoDisc d2 = new DigitalVideoDisc("Inception");
        DigitalVideoDisc d3 = new DigitalVideoDisc("Interstellar");

        store.addDVD(d1);
        store.addDVD(d2);
        store.addDVD(d3);
        store.print();

        System.out.println("\n-- Remove a DVD and print --");
        store.removeDVD(d2);
        store.print();

        System.out.println("\n-- Try to remove a DVD not in store --");
        DigitalVideoDisc notInStore = new DigitalVideoDisc("Not In Store");
        store.removeDVD(notInStore);

        System.out.println("\n-- Fill store to capacity (100) --");
        for (int i = store.getQtyInStore(); i < 100; i++) {
            store.addDVD(new DigitalVideoDisc("Bulk-" + (i + 1)));
        }
        System.out.println("Store size after filling: " + store.getQtyInStore());

        System.out.println("\n-- Try adding one more beyond capacity --");
        store.addDVD(new DigitalVideoDisc("Overflow"));

        System.out.println("\n-- Final inventory snapshot --");
        store.print();
    }
}
