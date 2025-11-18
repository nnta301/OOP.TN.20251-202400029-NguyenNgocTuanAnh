package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<BookAuthor> authors = new ArrayList<>();
        authors.add(new BookAuthor("Nguyen Ngoc Tuan Anh", 2006, "Student"));
        authors.add(new BookAuthor("Tran Van A", 1975, "Writer"));

        Book book = new Book("Learning OOP", "Education", 29.99, 12000, authors);

        System.out.println("-- Book details --");
        System.out.println(book);

        System.out.println("\n-- Book with no authors --");
        Book book2 = new Book("Standalone Book", "Fiction", 15.0, 8000, null);
        System.out.println(book2);
    }
}
