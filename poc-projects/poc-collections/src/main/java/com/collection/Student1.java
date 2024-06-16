package com.collection;

public class Student1 implements Comparable<Student1> {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student1 other) {
        return this.age - other.age; // sort by age
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
