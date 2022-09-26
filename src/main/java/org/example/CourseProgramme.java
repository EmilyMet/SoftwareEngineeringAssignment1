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

    public void addModule(String moduleName){
        modules.add(moduleName);
    }

    public ArrayList getModules(){
        return modules;
    }

    public void addStudent(String student){
        students.add(student);
    }

    public ArrayList getStudents(){
        return students;
    }

}
