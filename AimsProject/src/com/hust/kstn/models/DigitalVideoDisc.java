package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    private String director;
    private int length;

    // Constructor với tham số title
    public DigitalVideoDisc(String title) {
        super(title, 0.0, null);
    }

    // Constructor với category, title và cost
    public DigitalVideoDisc(String category, String title, double cost) {
        super(title, cost, category);
    }

    // Constructor với director, category, title và cost
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(title, cost, category);
        this.director = director;
    }

    // Constructor với tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, cost, category);
        this.director = director;
        this.length = length;
    }

    // Getters
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    // Setters
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        String t = getTitle() != null ? getTitle() : "N/A";
        String c = getCategory() != null ? getCategory() : "N/A";
        String d = director != null ? director : "N/A";
        return "DVD[" + getId() + "] - " + t + " - " + getCost() + " - " + length + " - " + c + " - " + d;
    }
}