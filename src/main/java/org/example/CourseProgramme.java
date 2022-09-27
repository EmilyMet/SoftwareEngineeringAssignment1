package org.example;
import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {
    private String name;
    private ArrayList<String> modules = new ArrayList<String>();
    private ArrayList<String> students = new ArrayList<String>();
    private DateTime startDate, endDate;

    public CourseProgramme(String name, DateTime startDate, DateTime endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Method to add a module to the course programme's module list
    public void addModule(String moduleName){
        modules.add(moduleName);
    }

    //Method to get the course programme's module list
    public ArrayList getModules(){
        return modules;
    }

    //Method to add a student to the course programme's student list
    public void addStudent(String student){
        students.add(student);
    }

    //Method get the course programme's student list
    public ArrayList getStudents(){
        return students;
    }

}
