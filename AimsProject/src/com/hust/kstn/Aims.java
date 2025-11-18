package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart cart = new Cart();

        // Tạo các DVD mới
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 
                "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
                "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99);

        // Thêm DVD vào giỏ hàng
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);

        // In ra thông tin giỏ hàng
        cart.print();

        // Tính tổng giá trị giỏ hàng
        System.out.println("\nTotal cost calculated: $" + cart.calculateTotalCost());

        // Xóa một DVD khỏi giỏ hàng
        System.out.println("\n--- Removing dvd2 from cart ---");
        cart.removeDVD(dvd2);

        // In lại giỏ hàng sau khi xóa
        cart.print();

        // Tính lại tổng giá trị
        System.out.println("\nTotal cost after removal: $" + cart.calculateTotalCost());
    }
}
