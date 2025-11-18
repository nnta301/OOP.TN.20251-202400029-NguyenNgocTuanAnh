package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<BookAuthor> authors = new ArrayList<>();
    private int numOfTokens;

    // Constructor khởi tạo toàn bộ thuộc tính
    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        super(title, cost, category);
        this.numOfTokens = numOfTokens;
        if (authors != null) {
            this.authors.addAll(authors);
        }
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + this.numOfTokens + "]" + "\nAuthors: " + this.authors;
    }
}
