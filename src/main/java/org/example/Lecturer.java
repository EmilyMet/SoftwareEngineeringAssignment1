package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Lecturer {
    private String name, username;
    private LocalDate DOB, currentDate;
    private int age, ID;
    private ArrayList<String> modules = new ArrayList<String>();

    public Lecturer(String name, LocalDate DOB, int ID){
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
}
