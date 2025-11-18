package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered;

    // Thêm DVD vào giỏ hàng
    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        
        itemsInCart[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added successfully");
    }

    // Thêm hai DVD cùng lúc
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        int toAdd = 0;
        if (disc1 != null) toAdd++;
        if (disc2 != null) toAdd++;

        if (toAdd == 0) return;

        if (qtyOrdered + toAdd > MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }

        if (disc1 != null) addDVD(disc1);
        if (disc2 != null) addDVD(disc2);
    }

    // Thêm nhiều DVD (varargs) — có thể truyền mảng hoặc danh sách tham số
    public void addDVD(DigitalVideoDisc... discs) {
        if (discs == null) return;

        int toAdd = 0;
        for (DigitalVideoDisc disc : discs) {
            if (disc != null) toAdd++;
        }

        if (toAdd <= 0) return;

        if (qtyOrdered + toAdd > MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }

        for (DigitalVideoDisc disc : discs) {
            if (disc == null) continue;
            addDVD(disc);
        }
    }

    // Xóa DVD khỏi giỏ hàng
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] == disc) {
                // Dịch chuyển các phần tử về phía trước
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                found = true;
                System.out.println("The disc has been removed successfully");
                break;
            }
        }
        
        if (!found) {
            System.out.println("The disc is not in the cart");
        }
    }

    // Tính tổng giá trị giỏ hàng
    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    // In ra thông tin giỏ hàng
    public void print() {
        System.out.println("======================= THE CURRENT CART =======================");
        System.out.print("Total items: " + qtyOrdered);

        if (qtyOrdered == 0) {
            System.out.println(" - The cart is empty");
            System.out.println("================================================================");
            return;
        }

        System.out.println();
        // Print all items in one line separated by " - " as requested
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc item = itemsInCart[i];
            System.out.print(item.toString());
            if (i < qtyOrdered - 1) System.out.print(" - ");
        }

        System.out.println();
        System.out.println("Subtotal: " + calculateTotalCost() + "$");
        System.out.println("================================================================");
    }

    // Kiểm tra giỏ hàng rỗng
    public boolean isEmpty() {
        return qtyOrdered == 0;
    }

    // Lấy số lượng DVD trong giỏ
    public int getQtyOrdered() {
        return qtyOrdered;
    }
}
