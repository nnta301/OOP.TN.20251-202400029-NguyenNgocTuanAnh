package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");

        swap(s1, s2);

        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());

        // Demonstrate you can modify internal state though reference is passed by value
        changeName(s1, "Z");
        System.out.println("After changeName, first student: " + s1.getName());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeName(Student s, String newName) {
        if (s != null) s.setName(newName);
    }
}
