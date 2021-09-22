package com.company;

public abstract class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public abstract void takeCourse(Course course);
}
