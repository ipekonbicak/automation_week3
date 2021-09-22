package com.company;

import java.util.ArrayList;
import java.util.List;

public class Course {

    public String name;
    public double credit;
    public int studentCount = 0;
    public int teacherCount;
    public int courseCapacity;
    public Teacher teacher;
    List<Student> students = new ArrayList<>();

    public Course(String name, double credit, int courseCapacity) {
        this.name = name;
        this.credit = credit;
        this.studentCount = 0;
        this.teacherCount = 0;
        this.courseCapacity = courseCapacity;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    //Check how many students have taken this course.
    public boolean checkCapacity() {
        if (courseCapacity == studentCount) {
            return false;
        }
        return true;
    }

    //check if course has a teacher or not
    public boolean checkTeacherCapacity(){
        if (teacherCount == 1) {
            return false;
        }
        return true;
    }

    //Check student max credit amount and course capacity if everything is OK then add course.
    public void addStudent(Course course,Student student){
        if((student.maxCredit != student.coursesGot())){
            if(checkCapacity()){
                this.studentCount = this.studentCount++;
                this.students.add(student);
                student.setCreditGot(course.credit + student.getCreditGot());
                System.out.println("Your transaction is successfully completed");
            }else{
                System.out.println("Sorry, the course is full.");
            }
        }else{
            System.out.println("You have reached the end of the course capacity you can take.");
        }
    }

    //enroll teacher to this course.
    public void addTeacher(Course course, Teacher teacher){
        if((teacher.maxCourse != teacher.coursesGot())){
            if(checkTeacherCapacity()){
                this.teacherCount = this.teacherCount++;
                course.setTeacher(teacher);
                teacher.courseGiven.add(course);
                System.out.println("Your transaction is successfully completed");
            }else{
                System.out.println("Sorry, the course already have a teacher.");
            }
        }else{
            System.out.println("This teacher has reached the maximum number of lessons she/he can give.");
        }
    }
}
