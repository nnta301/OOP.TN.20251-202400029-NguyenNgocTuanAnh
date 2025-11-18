package com.hust.kstn.models;

public class Store {
    private static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore;

    // Thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc disc) {
        if (disc == null) return;
        if (qtyInStore >= MAX_ITEMS_IN_STORE) {
            System.out.println("The store is full");
            return;
        }
        itemsInStore[qtyInStore] = disc;
        qtyInStore++;
        System.out.println("The disc has been added to the store successfully");
    }

    // Xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc disc) {
        if (disc == null) return;
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                // Dịch chuyển các phần tử về phía trước
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                found = true;
                System.out.println("The disc has been removed from the store successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not in the store");
        }
    }

    public int getQtyInStore() {
        return qtyInStore;
    }

    // In ra danh sách các đĩa trong cửa hàng (dùng để kiểm thử)
    public void print() {
        System.out.println("===== Store Inventory: " + qtyInStore + " items =====");
        if (qtyInStore == 0) {
            System.out.println("The store is empty");
        } else {
            for (int i = 0; i < qtyInStore; i++) {
                DigitalVideoDisc item = itemsInStore[i];
                System.out.println((i + 1) + ". " + item.toString());
            }
        }
        System.out.println("==============================================");
    }
}
