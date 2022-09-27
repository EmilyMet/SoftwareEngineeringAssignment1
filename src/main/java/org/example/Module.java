package org.example;

import java.util.ArrayList;

public class Module {
    private String name, id, lecturer;
    private ArrayList<String> students = new ArrayList<String>();
    private ArrayList<String> courses = new ArrayList<String>();

    public Module(String name, String id, String lecturer){
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
    }

    //Method to add a student to the module's student list
    public void addStudent(String student){
        students.add(student);
    }

    //Method to get the module's student list
    public ArrayList getStudents(){
        return students;
    }

    //Method to add a course to the module's course list
    public void addCourse(String course){
        courses.add(course);
    }

    //Method to get the module's course list
    public ArrayList getCourses(){
        return courses;
    }
}
