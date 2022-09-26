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

    public void addStudent(String student){
        students.add(student);
    }

    public ArrayList getStudents(){
        return students;
    }


    public void addCourse(String course){
        courses.add(course);
    }

    public ArrayList getCourses(){
        return courses;
    }
}
