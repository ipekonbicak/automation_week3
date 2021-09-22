package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Course course;
        List<Course> courseList = new ArrayList<>();
        Student student;
        Teacher teacher;
        int age;
        String inputVal, name, surname, gender, year, courseName;

        //Creating Courses
        course = new Course("Math", 6.5, 3);
        courseList.add(course);
        course = new Course("Biology", 4.2, 1);
        courseList.add(course);
        course = new Course("Optional Lesson", 2, 2);
        courseList.add(course);
        course = new Course("Chemistry", 5, 2);
        courseList.add(course);
        course = new Course("History", 4.3, 2);
        courseList.add(course);

        System.out.println("Press 'SR' to enroll student in the course, "+
                "Press 'TR' to register a teacher for the course.");
        inputVal = scanner.nextLine();

        if (inputVal.equals("SR")){
            //getting student information for recording student to a course.
            System.out.println("Enter student information you want to add.");
            System.out.print("Name :");
            name = scanner.nextLine();
            System.out.print("Surname :");
            surname = scanner.nextLine();
            System.out.print("Age :");
            age = scanner.nextInt();
            System.out.println("Gender");
            gender = scanner.next();
            System.out.println("Year");
            year = scanner.next();
            student = new Student(name, surname,age,gender,year);

            //List courses to show courses to client and get the name of the course to the client.
            System.out.println("Which course do you want to get ?");
            for(int i = 0; i < courseList.size(); i++){
                System.out.println(courseList.get(i).name);
            }
            courseName = scanner.next();

            //Find course in courses array and add student to this course.
            for(int i = 0; i < courseList.size(); i++){
                if((courseList.get(i).name).equals(courseName)){
                    course.addStudent(courseList.get(i), student);
                    break;
                }
            }
        }else {
            System.out.println("Enter teacher information you want to add.");
            System.out.print("Name :");
            name = scanner.nextLine();
            System.out.print("Surname :");
            surname = scanner.nextLine();
            System.out.print("Age :");
            age = scanner.nextInt();
            System.out.println("Gender");
            gender = scanner.next();
            teacher = new Teacher(name, surname,age,gender);

            //List courses to show courses to client and get the name of the course to the client.
            System.out.println("Which course do you want to get ?");
            for(int i = 0; i < courseList.size(); i++){
                System.out.println(courseList.get(i).name);
            }
            courseName = scanner.next();

            //Find course in courses array and add student to this course.
            for(int i = 0; i < courseList.size(); i++){
                if((courseList.get(i).name).equals(courseName)){
                    course.addTeacher(courseList.get(i), teacher);
                    break;
                }
            }
        }

    }
}
