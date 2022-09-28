package org.example;

import java.util.ArrayList;

public class Module {
    private String name, id, lecturer;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();

    public Module(String name, String id, String lecturer){
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
    }

    //Getter method for the Module name
    public String getName(){
        return name;
    }

    //Method to add a student to the module's student list
    public void addStudent(Student s){
        students.add(s);
    }

    //Method to get the module's student list
    public ArrayList getStudents(){
        return students;
    }

    //Method to add a course to the module's course list
    public void addCourse(CourseProgramme c){
        courses.add(c);
    }

    //Method to get the module's course list
    public ArrayList getCourses(){
        return courses;
    }
}
