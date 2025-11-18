package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private static int nbBooks = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<BookAuthor> authors = new ArrayList<>();
    private int numOfTokens;

    // Constructor khởi tạo toàn bộ thuộc tính
    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        this.id = ++nbBooks;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        if (authors != null) {
            this.authors.addAll(authors);
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        return "Book[" + this.id + "]["  
               + this.title + "]["  
               + this.cost + "]["  
               + this.category + "]["  
               + this.numOfTokens + "]"  
               + "\nAuthors: " + this.authors;
    }
}
