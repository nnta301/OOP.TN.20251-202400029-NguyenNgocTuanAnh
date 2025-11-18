package com.hust.kstn.models;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    // Constructor với tham số title
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Constructor với category, title và cost
    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor với director, category, title và cost
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor với tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[Title]: " + title + 
               " | [Category]: " + (category != null ? category : "N/A") +
               " | [Director]: " + (director != null ? director : "N/A") +
               " | [Length]: " + length + " mins" +
               " | [Cost]: $" + cost;
    }
}
