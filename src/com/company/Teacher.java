package com.company;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    List<Course> courseGiven = new ArrayList<>();
    public int maxCourse = 3;

    public Teacher(String name, String surname, int age, String gender) {
        super(name, surname, age, gender);
    }

    @Override
    public void takeCourse(Course course) {
        courseGiven.add(course);
    }

    public int coursesGot(){
        int courseNumber;
        if(courseGiven != null){
            courseNumber = courseGiven.size();
        }else{
            courseNumber = 0;
        }
        return courseNumber;
    }
}
