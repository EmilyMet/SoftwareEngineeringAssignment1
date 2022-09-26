package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Student {
    private String name, username;
    private LocalDate DOB, currentDate;
    private int age, ID;
    private ArrayList<String> courses = new ArrayList<String>();
    private ArrayList<String> modules = new ArrayList<String>();

    public Student(String name, LocalDate DOB, int ID){
        this.name = name;
        this.ID = ID;
        this.DOB = DOB;
        currentDate = LocalDate.now();
        age = Period.between(DOB, currentDate).getYears();
    }

    public String getUsername(){
        username = name + age;
        return username;
    }

    public void addModule(String moduleName){
        modules.add(moduleName);
    }

    public ArrayList getModules(){
        return modules;
    }

    public void addCourses(String courseName){
        courses.add(courseName);
    }

    public ArrayList getCourses(){
        return courses;
    }
}
