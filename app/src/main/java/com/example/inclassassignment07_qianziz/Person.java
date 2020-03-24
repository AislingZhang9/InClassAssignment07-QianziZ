package com.example.inclassassignment07_qianziz;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    boolean isFullTime;

    public Person(String name, int age, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAge: %s\nFull Time? %s", name, age, isFullTime);
    }

}
