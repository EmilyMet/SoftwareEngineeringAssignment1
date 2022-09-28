package org.example;
import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {
    private String name;
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private DateTime startDate, endDate;

    public CourseProgramme(String name, DateTime startDate, DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Getter method for the CourseProgramme name
    public String getName(){
        return name;
    }

    //Method to add a module to the course programme's module list
    public void addModule(Module m){
        modules.add(m);
    }

    //Method to get the course programme's module list
    public ArrayList getModules(){
        return modules;
    }

    //Method to add a student to the course programme's student list
    public void addStudent(Student s){
        students.add(s);
    }

    //Method get the course programme's student list
    public ArrayList getStudents(){
        return students;
    }

}
