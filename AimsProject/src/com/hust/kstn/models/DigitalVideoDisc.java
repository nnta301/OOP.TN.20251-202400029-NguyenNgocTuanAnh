package com.hust.kstn.models;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    // Constructor với tham số title
    public DigitalVideoDisc(String title) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
    }

    // Constructor với category, title và cost
    public DigitalVideoDisc(String category, String title, double cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor với director, category, title và cost
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    // Constructor với tất cả các thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.id = ++nbDigitalVideoDiscs;
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

    public int getId() {
        return id;
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
        String t = title != null ? title : "N/A";
        String c = category != null ? category : "N/A";
        String d = director != null ? director : "N/A";
        return "DVD[" + id + "] - " + t + " - " + cost + " - " + length + " - " + c + " - " + d;
    }
}