package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{
    public String year;
    public List<Course> coursesGotten= new ArrayList<Course>();
    public int maxCredit = 20;
    public double creditGot;

    public Student(String name, String surname, int age, String gender, String year) {
        super(name, surname, age, gender);
        this.year = year;
        creditGot = 0;
    }

    public double getCreditGot() {
        return creditGot;
    }

    public void setCreditGot(double creditGot) {
        this.creditGot = creditGot;
    }

    @Override
    public void takeCourse(Course course) {
        coursesGotten.add(course);
    }

    public int coursesGot(){
        int courseNumber;
        if(coursesGotten != null){
            courseNumber = coursesGotten.size();
        }else{
            courseNumber = 0;
        }
        return courseNumber;
    }
}
